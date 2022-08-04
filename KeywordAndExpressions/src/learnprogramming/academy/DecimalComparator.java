package learnprogramming.academy;

public class DecimalComparator {


    public static boolean areEqualByThreeDecimalPlaces(double n1, double n2){

        return (int)(n1*1000)==(int)(n2*1000);
    }

    public static boolean hasEqualSum(int a, int b, int result){
        return a+b==result;
    }

    public static boolean hasTeen(int a1, int a2, int a3){
        return isTeen(a1)||isTeen(a2)||isTeen(a3);
    }
    public static boolean isTeen(int age){
        return age>=13 && age<=19;
    }
}
