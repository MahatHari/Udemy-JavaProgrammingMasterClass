package learnprogramming.academy;

public class PC {

    /* Composition */
//    PC has Case, PC has Monitor, PC has Motherboard,
    private  Case theCase;
    private  Monitor monitor;
    private  Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private  void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }
    public Case getTheCase() {
        return theCase;
    }


    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
