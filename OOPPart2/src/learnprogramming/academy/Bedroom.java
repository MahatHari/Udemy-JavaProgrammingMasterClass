package learnprogramming.academy;

/*
*               Class Composition
*           Bedroom has Bed, Walls, Ceiling, lamp
* */
public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Bed bed;
    private Ceiling ceiling;
    private  Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Ceiling ceiling, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public String getName() {
        return name;
    }

    public Wall getW1() {
        return wall1;
    }

    public Wall getW2() {
        return wall2;
    }

    public Wall getW3() {
        return wall3;
    }

    public Wall getW4() {
        return wall4;
    }

    public Bed getBed() {
        return bed;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public  void makeBed(){
       bed.make();
    }
}
