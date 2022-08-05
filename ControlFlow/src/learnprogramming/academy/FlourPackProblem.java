package learnprogramming.academy;

public class FlourPackProblem {

/*
* canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.

canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.

canPack (-3, 2, 12); should return false since bigCount is negative.
* */

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0){
            return false;
        }
        int bigCountToUse= bigCount<goal/5 ? bigCount:goal/5;
        return(goal-bigCountToUse*5)<=smallCount;

    }

    public static int getLargestPrime(int num){

        for(int i=num/2; i>2; i--){
            if(num%i==0){
                if(isPrime(i)){
                    return i;
                }
            }
        }

        return num ;
    }
    public static boolean isPrime(int num){
        for(int i=2; i<num/2; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }

    public  static int getLargestPrimeV2(int num){
        if(num<2){
            return -1;
        }
        for(int i=2; i<num; i++){
            if((num%i)==0){
                num/=i;
                i--;
            }
        }
        return num;
    }

}
