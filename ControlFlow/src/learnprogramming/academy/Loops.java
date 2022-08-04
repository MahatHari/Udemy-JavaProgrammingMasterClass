package learnprogramming.academy;

public class Loops {

//    for loops
//   for(init; termination; increment ){code block}
    public static void testForLoop(){
        for(int i=2; i<8+1;  i++){
            System.out.println("Interest , for interest Rate of   "+ i + " is : "+ String.format("%.2f", calculateInterest(10000.0, i)) );
        }

        System.out.println("**************************");
        for(int i=8; i>=2;  i--){
            System.out.println("Interest , for interest Rate of   "+ i + " is : "+ String.format("%.2f", calculateInterest(10000.0, i)) );
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i=2; i<=n/2; i++){  // i<=(long)Math.sqrt(n) is more optimized.
            if(n%i ==0){
                return false;
            }
        }
        return  true;
    }

    public  static void printThreePrimesInRange(int lower, int upper){
        int count=0;
        for(int i=lower; i <=upper; i++){
            if (isPrime(i)) {
                count++;
                    System.out.println(i+ " is " +count+ " Prime ");

            }
            if(count==3){
                break;
            }
        }
    }

    public static boolean isOdd(int number){
        if ( number>0){
             if (number%2==0){
                 return false;
             }
             return true;
        }
        return false;
    }
    public  static int sumOdd( int start, int end ){
        if(end<start || end<=0 || start<=0){
            return -1;
        }
        int sum=0;
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }

    public static void whileLoop(){
        int number=4; int finishNumber=20; int evenNumbersFound=0;
        while(number<=finishNumber){
            number++;
            if(isOdd(number)){
                continue;
            }
            evenNumbersFound ++;

        }
        System.out.println("Total Even numbers found "+ evenNumbersFound);
    }

    public static void doWhileLoop(){
        int number=4; int finishNumber=20; int evenNumbersFound=0;
       do {
            number++;
            if(isOdd(number)){
                continue;
            }
            evenNumbersFound ++;

        } while(number<=finishNumber);
        System.out.println("Total Even numbers found "+ evenNumbersFound);
    }
    public static boolean isPalindrome(int number){
        int reversNumber=0;
        if(number<0){
            number*=-1;
        }
        int storedNum= number;
        while(storedNum!=0){
            int lastDigit=storedNum%10;
            reversNumber=(reversNumber*10)+lastDigit;
            storedNum/=10;
        }
        return number==reversNumber;
    }

    public static int firstAndLastDigitSum(int number){

    }

}
