import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x=98;
        int y=0;
        System.out.println(divideEAFP(x,y));
        System.out.println(divideLBYL(x,y));

       // x= getInt();
        x=getIntLBYL();
        System.out.println(x);

        y= getIntEAFP();
        System.out.println(y);


    }
    public static int divideLBYL(int x, int y){  // divide Look Before You Leap

        if(y!=0){   // look before you leap, test if denominator is 0 3/0 gives ArithmeticException
            return  x/y;
        }else {
            return  0;
        }

    }

    private static  int divideEAFP(int x, int y){ // Easy to Ask for Forgiveness than Permission
        try{
            return x/y;
        }catch (ArithmeticException e){
            System.out.println("Division by 0 is not allowed");
            return 0;
        }
    }
    private  static  int divide(int x, int y){  // will cause error in case of y being 0
        return x/y;
    }

    public static  int getInt(){
        Scanner s= new Scanner(System.in);
        return s.nextInt();
    }
    private  static  int getIntLBYL(){
        Scanner s= new Scanner(System.in);
        boolean isValid=true;
        System.out.println("Please enter and integer");
       String input = s.next();
       for (int i=0; i<input.length(); i++){
           if(!Character.isDigit(input.charAt(i))){
               isValid=false;
               break;
           }
       }
       if (isValid){
           return Integer.parseInt(input);
       }
           return 0;
    }

    private static int getIntEAFP(){
        Scanner s= new Scanner(System.in);
        System.out.println("Please Enter and integer");
        try{
            return s.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }
}
