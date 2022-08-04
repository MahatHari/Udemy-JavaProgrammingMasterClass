package learnprogramming.academy;

public class LeapYear {

    public static boolean isLeapYear(int Year){
        if(0 < Year || Year >9999){
            return false;
        }
        //if year divided by 4
        if (Year%4==0){
            //if year is century
            if(Year%100==0){
                //if year is divided by 400, its a leap year
                if (Year%400==0){
                    return  true;
                }else{
                    return false;
                }
            }
            // if the year is not century
            else{
                return true;
            }
        }else{
            return false;
        }
    }
}
