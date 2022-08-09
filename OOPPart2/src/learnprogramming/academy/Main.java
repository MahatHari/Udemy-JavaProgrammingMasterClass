package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions= new Dimensions(2,3,4);
        Case theCase = new Case("22B", "Dell" , "240", dimensions);
        Motherboard motherboard= new Motherboard("BJ-200", "Intel", 2, "IntelV2.44");
        Monitor monitor = new Monitor("34 inch Samsung", "Samsung", 34, new Resolution(34,32));

        PC myPc= new PC(theCase, monitor,motherboard);

        myPc.getMonitor().drawPixelAt(100, 1200, "red");
        myPc.getMotherboard().loadProgram("Windows 7.0 ");
       myPc.powerUp();


//       Test Bedroom, Composition
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4,  bed,ceiling,lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();

//        Player Without Encapsulation
        Player player= new Player();
        player.name="John";
        player.health=20;
        player.weapon="Sword";

        int damage=10;
        player.losHealth(damage);
        System.out.println("Remaining health ="+ player.healthRemaining());

        damage=11;
        player.losHealth(damage);
        System.out.println("Remaining health = "+ player.healthRemaining());

//        Printer  Test Codes
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

//        Burger Test
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

    }
}
