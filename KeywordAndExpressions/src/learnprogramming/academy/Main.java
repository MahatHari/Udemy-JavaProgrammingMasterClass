package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {

//        There are many reserved keywords that can not be used as variable name. Example:- int, float, double, true, false

           /* double kilometer= (100*1.609344); // this is expression
            int highScore= 50;  // declaration and assignment.

        boolean gameOver=true;
        int score=800;
        int levelCompleted=5;
        int bonus=100;


        // Call method and pass arguments
        calculateScore(gameOver, score, bonus, levelCompleted);
        score=1000;
        levelCompleted=8;
        bonus=200;

        // Call method and pass arguments
        calculateScore(gameOver, score, bonus, levelCompleted);

        // using method with return

        int returnedScore = returnScore(gameOver, score, bonus, levelCompleted);
        System.out.println("Returned Score : "+ returnedScore);

        int position= calculateHighScorePosition(1500);
        String name= "Hary";
        displayHighScorePosition(name, position);
         position= calculateHighScorePosition(900);
         name= "Gary";
        displayHighScorePosition(name, position);
        position= calculateHighScorePosition(400);
        name= "Sally";
        displayHighScorePosition(name, position);
        position= calculateHighScorePosition(40);
        name= "Rally";
        displayHighScorePosition(name, position);*/

        SpeedConverter sp= new SpeedConverter();
        sp.toMilesPerHour(-1);
        sp.printConversion(10.0);

        MegaBytesConverter mb= new MegaBytesConverter();
        mb.printMegaBytesAndKiloBytes(0);

        BarkingDog bd= new BarkingDog();
        System.out.println(bd.shouldWakeup(true,-1));

        DecimalComparator dc= new DecimalComparator();
        System.out.println(dc.isTeen(14));

//        Method Overloading inside class MethodOverloading
        MethodOverloading ml= new MethodOverloading();
        ml.calculateScore("Hari", 3);
        ml.calculateScore(30);

        FeetAndInchesToCentimeters  fic= new FeetAndInchesToCentimeters();
        double centimeters= fic.calcFeetAndInchesToCentimeters(-6,13);
        System.out.println("0 inches to "+ centimeters + "cm.");
         centimeters= fic.calcFeetAndInchesToCentimeters(140.45);
        System.out.println("140.45 inches to "+ centimeters + "cm.");

    }

//    Java methods

    public  static  void  calculateScore(boolean gameOver, int score, int bonus, int levelCompleted){
        if(gameOver){
            int finalScore= score+( bonus*levelCompleted);
            finalScore+=2000;
            System.out.println("Your Final score is :"+ finalScore);
        }
    }
//    Method with  int type return.
    public static int returnScore(boolean gameOver, int score, int bonus, int levelCompleted){
        if(gameOver){
            int finalScore= score+( bonus*levelCompleted);
            return finalScore+=2000;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into position "+ position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }else if (score>=500){
            return 2;
        }else if (score >=100){
            return 3;
        }else{
            return 4;
        }
    }

}
