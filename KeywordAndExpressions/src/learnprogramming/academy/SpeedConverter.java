package learnprogramming.academy;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        long milesPerHour= Math.round(kilometersPerHour/1.609);
        return milesPerHour;
    }

    public static void printConversion (double kilometersPerHour){
        long result= toMilesPerHour(kilometersPerHour);
        if(result==-1){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+"km/hr= " + result + "mi/hr" );
        }
    }

}
