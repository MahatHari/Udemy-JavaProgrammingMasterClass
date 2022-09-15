import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {


        List <String> someBigNumbers= Arrays.asList(
                "N40", "N36", "B12", "B6",
                "G53","G49", "G60", "g50", "g64",
                "I26", "I17", "I29", "O71"
        );

        List <String> gNumbers= new ArrayList<>();

        someBigNumbers.forEach((number)->{
            if(number.toUpperCase().startsWith("G")){
                gNumbers.add(number);
               // System.out.println(number);
            }
        });

        // Sorting and printing
        System.out.println("==========Sorted Numbers ===========");
        gNumbers.sort((String s1, String s2)->s1.compareTo(s2));
        gNumbers.forEach((String s)-> System.out.println(s));

        /**  Using Streams to chain  */
        /**  Streams-> Intermediate Operations -> Terminal Operations*/
        System.out.println("=======Stream ===========");
        someBigNumbers.stream().map(String::toUpperCase) // :: is called method reference
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);  // terminal operation, forEach does not return

        System.out.println("==============================");
        Stream<String> ioNumberStream= Stream.of("I26", "I17", "I29","I071" );
        Stream<String> inNumberStream= Stream.of("N26", "N17", "N29","N071", "I17", "I29" );
        Stream<String> concatStream= Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("---------------------------------");
        //System.out.println(concatStream.distinct().count());
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println(concatStream.distinct().peek(System.out::println).count());

    }
}
