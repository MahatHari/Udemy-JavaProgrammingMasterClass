package learnprogramming.academy;

public class MinutesToYears {

    /* Test Cases */
    /*
    * printYearsAndDays(525600);  → should print "525600 min = 1 y and 0 d"
    * printYearsAndDays(1051200); → should print "1051200 min = 2 y and 0 d"
    * printYearsAndDays(561600);  → should print "561600 min = 1 y and 25 d"
    * */
    public static void printYearsAndDays(long minutes){
        if (minutes<0) {
            System.out.println("Invalid Value");
        }
        else {
            int days = (int) minutes / (24 * 60);
            int year = (int) days / 365;
            int remainingDays= days - (year*365);
            int remainingMinutes = (int) minutes % (24 * 60);

            System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        }
    }

    /*
    * Test Cases
    * printEqual(1, 1, 1); should print text All numbers are equal
    * printEqual(1, 1, 2); should print text Neither all are equal or different
    * printEqual(-1, -1, -1); should print text Invalid Value
    * printEqual(1, 2, 3); should print text All numbers are different
    * */
    public static void printEqual(int a, int b, int c){
        if(a<0||b<0||c<0){
            System.out.println("Invalid Value");
        }else if(a==b && b==c){
            System.out.println("All numbers are equal");
        }else if(a !=b && b!=c && a!=c){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

/* Test Casess */
    /*
    * sCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
    * isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
    * isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
    * */

    public static  boolean isCatPlaying(boolean summer, int temperature){
        if(summer && (temperature>=25 && temperature<=45)){
            return true;
        } else if(temperature >= 25 && temperature <= 35){
            return true;
        }else{
            return false;
        }

    }

}
