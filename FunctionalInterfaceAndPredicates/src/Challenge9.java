import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Challenge9 {
    public static void main(String[] args) {

        /* Question: Write code to print the intems in the list in sorted order, and with
        the first letter in each name upper-cased. The name "harry" should be printed as "Harry"
        and should be printed after Emily and before Isla. Use lambda expression where ever possible
        * */
        List<String> topName2015= Arrays.asList(
                "Amelia", "Olivia", "emily", "isla", "Ava", "oliver",
                "Jack", "charlie", "harry", "jacob"
        );

        List<String> titleCaseList= new ArrayList<>();
        topName2015.forEach(name->{
            titleCaseList.add(name.substring(0,1).toUpperCase()+name.substring(1));
        });

        titleCaseList.sort((n1, n2)->n1.compareTo(n2));
        //titleCaseList.sort(String::compareTo);
        titleCaseList.forEach(name-> System.out.println(name));
        //  titleCaseList.forEach(System.out::println)


        /** Challenge 11, Now do the same thing with chain of stream operations*/
        System.out.println("=======Streamed to Title Case============");
        topName2015.stream()
                .map(name-> name.substring(0,1).toUpperCase()+name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        System.out.println(topName2015);



        /** Instead of printing out the sorted name, pring out how many names begin with letter 'A instead*/

        System.out.println("=======Names starting with A======");
       long namesBeginningWithA=  topName2015.stream()
                .map(name->name.substring(0,1).toUpperCase()+name.substring(1))
                .filter(name->name.startsWith("A"))
                .count();

        System.out.println("Number of names beginning with A"+ namesBeginningWithA);


        System.out.println("======Using Peek in Stream=======");
        topName2015.stream()
                .map(name->name.substring(0,1).toUpperCase()+name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }
}
