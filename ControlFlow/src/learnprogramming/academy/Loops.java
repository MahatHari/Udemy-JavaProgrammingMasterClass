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
        if(number<0){
            return  -1;
        }
        int lastDigit= number%10;

        while(number>9){
            number/=10;
        }
        return number+lastDigit;

    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum=0;
        int remainder=0;
        while(number>0){
            remainder = number%10;
            sum+= (remainder%2==0) ?remainder:0;
            number/=10;
        }
        return  sum;
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1>9 && num1<=99) &&  (num2>9 && num2<=99)){
            int num1remainder=0;
            int num2remainder=0;
            while(num1>9 || num2 >9){
                 num1remainder= num1%10;
                 num2remainder=num2%10;
                if(num1remainder==num2remainder){
                    return true;
                }
                num1/=10;
                num2/=10;
                if(num1==num2remainder || num2==num1remainder || num1==num2){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(isValid(num1)&& isValid(num2) && isValid(num3)){
                if(num1%10==num2%10 || num2%10==num3%10 || num1%10 ==num3%10){
                    return true;
                }
        }
        return false;
    }
    public static boolean isValid(int num){
        if(num>=10 && num<=1000){
            return true;
        }
        return  false;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first >=10 && second>=10){
            int divisor= first>second ?second:first;
            while(divisor>0){
                if(first%divisor==0 && second%divisor==0){
                    return divisor;
                }
                divisor--;
            }
        }
        return -1;
    }

    // Using Euclid's Algorithm
    public static  int GCD(int first, int second){
        if (first>=10 && second >=10){
            while(first!=second){
                if(first<second){
                    second-=first;
                }else{
                    first-=second;
                }
            }
            return (first*second)/second;
        }
        return -1;
    }

    public static void printFactors(int number){
        if(number>0){
            int i=1;
            while(i<=number/2){
                if(number%i==0){
                    System.out.println(i);
                }
                i++;
            }
            System.out.println(number);
        }else{
            System.out.println("Invalid Value");
        }

    }

    public static boolean isPerfectNumber(int number){
        if(number>=1){
            int sum=0;
            int i=1;
            while(i<=number/2){
                if(number%i==0){
                    sum+=i;
                }
                i++;
            }
            if (sum==number){
                return true;
            }
            return false;
        }
        return false;
    }
}
