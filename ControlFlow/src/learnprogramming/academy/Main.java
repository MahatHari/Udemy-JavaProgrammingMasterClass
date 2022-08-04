package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /* Switch Flow */

        int switchValue=3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("was 3 or 4 or 5");
                break;
            default:
                System.out.println("Unknown Value");
                break;
        }

        char charValue='A';

        switch (charValue){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("Unknown Choice");
                break;
        }

        String stringValue="JanUaRY";

        switch (stringValue.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            default:
                System.out.println("Unknown Choice");
                break;
        }

//        Call printDayOfWeek method with 3
        printDayOfWeek(3);

//         Test NumberOf Days In Month
        NumberOfDaysInMonth  ndm= new NumberOfDaysInMonth();
        System.out.println(ndm.getDaysInMonth(1,2020)); //31
        System.out.println(ndm.getDaysInMonth(2,2020)); // 29
        System.out.println(ndm.getDaysInMonth(2,2018)); // 28
        System.out.println(ndm.getDaysInMonth(-1,2020)); // -1
        System.out.println(ndm.getDaysInMonth(1,-2020)); // -1
        System.out.println(ndm.getDaysInMonth(1,1989)); // 31

        Loops l = new Loops() ;
        l.testForLoop();

//        Test Prime
        l.printThreePrimesInRange(23, 99);
        l.printThreePrimesInRange(40, 99);
        l.whileLoop();
        System.out.println("Do While Loop");
        l.doWhileLoop();

        System.out.println("Palindrome");
        System.out.println(l.isPalindrome(-12121));
        System.out.println(l.isPalindrome(707));
        System.out.println(l.isPalindrome(11212));


    }
    public static void printDayOfWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wedday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }
    }
    public static void printNumberInWord(int num){
        switch (num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }

    public static class NumberOfDaysInMonth {

        public static boolean isLeapYear(int year){
            if(year>=1 && year<=9999){
                if(year%4==0){
                    //if century
                    if(year%100==0){
                        // century must also be divisible by 400
                        if (year%400==0){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return true;
                    }
                }else{
                    return false;
                }
            }

            return false;
        }
    /* Test Cases */

    /*
    * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
    * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
    * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
    * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
    * getDaysInMonth(1, -2020);
    * */
        public static int getDaysInMonth(int month, int year){
            if (month <1 && month >12){
                return -1;
            }
            if (year <1 || year >9999){
                return -1;
            }
            boolean isLeap= isLeapYear(year);
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                case 2:
                    return isLeap ? 29:28;

                case 4: case 6: case 9: case 11:
                    return 30;

                default:
                    return -1;

            }

        }


    }
}
