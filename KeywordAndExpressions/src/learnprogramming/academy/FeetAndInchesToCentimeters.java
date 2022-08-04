package learnprogramming.academy;

public class FeetAndInchesToCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet<=0 || (inches<0 && inches >12)){
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double totalInches= feet*12 + inches;

        double totalCentimeters= totalInches * 2.54;
        return totalCentimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches<=0){
            return -1;
        }
        double totalFeet=(int)  inches/12;
        double inch=(int) inches % 12;
        System.out.println(inches + " inches equal to " + totalFeet + " feet and "+ inch + " inches" );
        return  calcFeetAndInchesToCentimeters(totalFeet, inch);
    }

}
