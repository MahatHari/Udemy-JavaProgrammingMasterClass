package learnprogramming.academy;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(){
        super("Deluxe", "Susage & Bacon", 19.10, "White roll");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition1("Drinks", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No addition allowed");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No addition allowed");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No addition allowed");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No addition allowed");
    }
}
