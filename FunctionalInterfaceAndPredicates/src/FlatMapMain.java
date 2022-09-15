import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String[] args) {
        Employee john= new Employee("John Doe", 30);
        Employee tim= new Employee("Tim Wood", 40);
        Employee jack= new Employee("Jack Sparrow", 63);
        Employee snow= new Employee("Snow Den", 50);
        Employee leopard= new Employee("Leopard Den", 24);
        Employee opard= new Employee("opard Den", 29);

        Department hr= new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting= new Department("Accounting");
        accounting.addEmployee(leopard);
        accounting.addEmployee(opard);
        List<Department> departments= new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments
                .stream()
                .peek(department -> System.out.println(department.getName()))
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);


        /**  Employees Grouped by Age*/
        System.out.println("======Grouped By Age==========");
        Map<Integer, List<Employee>> groupedByAge= departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));
        System.out.println("Grouped By Age: "+ groupedByAge);


        System.out.println("==========Using Reduce to find youngest Employee =========");
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((employee, employee2) -> employee.getAge()<employee2.getAge() ?employee:employee2)
                .ifPresent(System.out::println);



        List <String> someBigNumbers= Arrays.asList(
                "N40", "N36", "B12", "B6",
                "G53","G49", "G60", "g50", "g64",
                "I26", "I17", "I29", "O71"
        );
        /** Using Collect to create another object*/
        List<String> sortedList = someBigNumbers.stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());
                /*.collect(Collectors.toCollection(ArrayList::new));*/

        System.out.println("Sorted List : "+ sortedList);

            /** Collecting  as ArrayList methods Supplier-> Creates Objects, Accumulator-> adds to Arraylist, Combiner -> add all   */

            List<String> sortedList2 = someBigNumbers.stream()
                    .map(String::toUpperCase)
                    .filter(s->s.startsWith("G"))
                    .sorted()
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
                    /* >> .collect(Supplier, Accumulator, Combiner) */

    }
}
