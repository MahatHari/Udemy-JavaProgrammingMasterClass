package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche= new Car();
        Car holden= new Car();
        System.out.println(porsche);
        porsche.setModel("Ferrari");

        SimpleCalculator sc= new SimpleCalculator();
        sc.setFirstNumber(12);
        sc.setSecondNumber(3);
        System.out.println(sc.getAdditionResult());

        BankAccount ba= new BankAccount();
        ba.setBalance(500);
        ba.deposit(100);
        ba.withdraw(700);
        ba.withdraw(200);
        System.out.println(ba.getBalance());

//        Wall Area
        WallArea wa= new WallArea();
        wa.setHeight(2);
        wa.setWidth(3);
        System.out.println(wa.getArea());
        WallArea wb= new WallArea(-1, 2);
        System.out.println(wb.getArea());


//        Test Carpet Floor and Calculator
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

//        Test Complex number
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
