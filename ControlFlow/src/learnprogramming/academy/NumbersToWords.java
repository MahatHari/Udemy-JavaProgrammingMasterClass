package learnprogramming.academy;

public class NumbersToWords {

    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }
        int numberOfDigit= getDigitCount(number);
        int reversedNumber= reverse(number);
        for(int i=0; i<numberOfDigit; i++){
            switch (reversedNumber%10){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reversedNumber/=10;
        }
        System.out.println();
    }
    public static int reverse (int number){
        int reverseNumber=0;
            while(number!=0){
                reverseNumber=(reverseNumber*10)+(number%10);
                number/=10;
            }
        return reverseNumber;
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count=1;
        while(number>9){
            number/=10;
            count ++;
        }
        return count;
    }
}
