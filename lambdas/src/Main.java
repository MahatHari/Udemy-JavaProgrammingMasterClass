import java.lang.management.ManagementFactory;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// rite your code here
        new Thread(new CodeToRun()).start();


        // Anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from anonymous class of Runnable");
            }
        }).start();

        // Lambda
        new  Thread(()-> System.out.println("Lambda function running ")).start();
        // Lambda Expression  (parameters)->code body

        // Multiple  line code block lambda
        new Thread(()->{
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println("Line 3");
        }).start();


        Employee john= new Employee("John Doe", 30);
        Employee tim= new Employee("Tim Wood", 40);
        Employee jack= new Employee("Jack Sparrow", 63);
        Employee snow= new Employee("Snow Den", 50);

        List<Employee> employees= new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        /* Before Sorting */
        System.out.println("Before Sorting");
        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }

        /* Sorting employees */
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return  e1.getName().compareTo(e2.getName());
//            }
//        });

        // Using Lambda for sorting collections
        Collections.sort(employees, (Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));
        // This is also valid
        Collections.sort(employees, ( e1,e2)->e1.getName().compareTo(e2.getName()));

        System.out.println("After Sorting ");
        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }

        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
            },
            employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        // Using lambda to get silly String
        UpperConcat uc= (String s1, String s2)->(s1.toUpperCase()+s2
                .toUpperCase());
        String sillyString2= doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString2);


        AnotherClass anotherClass= new AnotherClass();
        String s= anotherClass.doSomething();
        System.out.println(s);

        ThirdClass thirdClass= new ThirdClass();
        String s2= thirdClass.doSomething();
        System.out.println(s2);
    }


    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);
    }
}

class  CodeToRun implements  Runnable{
    @Override
    public  void run(){
        System.out.println("Printing from Runnable");
    }
}

class  Employee{
    private  String name;
    private  int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
interface UpperConcat{
    public String upperAndConcat(String s1, String s2 );
}

class  AnotherClass{
    public  String doSomething(){
        System.out.println("The Third class's name is: "+ getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The Anonymous class's name is: "+ getClass().getSimpleName());
                return s1.toUpperCase()+s2.toUpperCase();
            }
        }, "String1", "String2");
    }
}

class ThirdClass{
    public  String doSomething(){
        UpperConcat uc= (s1,s2)->{
            System.out.println("The lambda class name is "+ getClass().getSimpleName());
            return s1.toUpperCase()+s2.toUpperCase();
        };
        System.out.println("The anohther class's name is : "+ getClass().getSimpleName());
        return  Main.doStringStuff(uc,"First String", "Second String");
    }
}