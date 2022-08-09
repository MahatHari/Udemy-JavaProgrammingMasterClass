package learnprogramming.academy;

public class Hamburger {
    private  String name;
    private  String meat;
    private  double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name+ " hamburger on a "+breadRollType+" with "+meat+", price is "+price);
    }

    public void addHamburgerAddition1 (String name, double price){
         addition1Name=name;
         addition1Price=price;

        System.out.println("Added "+addition1Name+" for an extra "+addition1Price);
    }
    public void addHamburgerAddition2(String name, double price){
       addition2Name=name;
       addition2Price=price;
        System.out.println("Added "+addition2Name+" for an extra "+addition2Price);
    }
    public void addHamburgerAddition3(String name, double price){
         addition3Name=name;
         addition3Price=price;
        System.out.println("Added "+addition3Name+" for an extra "+addition3Price);
    }
    public void addHamburgerAddition4(String name, double price){
         addition4Name=name;
         addition4Price=price;
        System.out.println("Added "+addition4Name+" for an extra "+addition4Price);
    }

    public double itemizeHamburger(){
        System.out.println("One order of " + name + " on " + breadRollType + " with " + addition1Name + " " + addition2Name + " " + addition3Name + " " + addition4Name);
        return (price+addition1Price+addition2Price+addition3Price+addition4Price);
    }

}
