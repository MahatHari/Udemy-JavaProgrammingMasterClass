import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee john= new Employee("John Doe", 30);
        Employee tim= new Employee("Tim Wood", 40);
        Employee jack= new Employee("Jack Sparrow", 63);
        Employee snow= new Employee("Snow Den", 50);
        Employee leopard= new Employee("Leopard Den", 24);
        Employee opard= new Employee("opard Den", 29);

        List<Employee> employees= new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(leopard);
        employees.add(opard);
        /* For Loop */
//        System.out.println("Before Sorting");
//        for (Employee employee: employees) {
//            System.out.println(employee.getName());
//        }

        /* For Each method*/
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        System.out.println("*************");
///        Filtering age above 30
        employees.forEach(employee -> {
            if(employee.getAge()>30){
                System.out.println(employee.getName());
                System.out.println(employee.getAge());
            }
        });

        // Using predicate to filter Employees, predicate is lambda expression
        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge()>30);
        printEmployeesByAge(employees, "Employees under 30", employee -> employee.getAge()<=30);

        // using anonymous function,  Predicate
        printEmployeesByAge(employees, "Employees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                    return employee.getAge()<25;
            }
        });

        // Writing Functions
        System.out.println("==========Writing Functions ============");
        Function<Employee, String> getLastName= (Employee employee)->employee.getName().substring((employee.getName().indexOf(' ')+1));

        String lastName= getLastName.apply(employees.get(3));
        System.out.println(lastName);


        System.out.println("========Get First Name ===========");
        Function<Employee, String> getFirstName= (Employee employee)->employee.getName().substring(0, employee.getName().indexOf(" "));

        String firstName= getFirstName.apply(employees.get(3));
        System.out.println(firstName);


        System.out.println("============Function Chaining =============");
        /** Function Chaining  */
        Function<Employee, String> upperCase=employee -> employee.getName().toUpperCase();
        Function<String, String> fName= name->name.substring(0, name.indexOf(" "));
        Function chainedFunction= upperCase.andThen(fName);

        System.out.println(upperCase.apply(employees.get(0)));
        System.out.println(fName.apply(employees.get(0).getName()));
        System.out.println(chainedFunction.apply(employees.get(0)));

    }
    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("==================================");
        for (Employee employee:employees) {
            if(ageCondition.test(employee)){
                System.out.println(employee.getAge()+ ": "+ employee.getName());
            }
        }
    }
}
