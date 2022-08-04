package learnprogramming.academy;


public class MethodOverloading {


    public static int calculateScore(String name, int score){
        System.out.println("Player "+ name + " scored "+ score+ " points.");
        return score*100;
    }

    public static int calculateScore(int score){
        System.out.println("Unamed player scored "+ score + " points.");
        return score*100;
    }

}
