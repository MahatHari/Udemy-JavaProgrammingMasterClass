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
        myPc.getTheCase().pressPowerButton();
    }
}
