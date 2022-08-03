package learnprogramming.academy;



public class Main {

    public static void main(String[] args) {
	// write your code here/
//        Data Types

//        int occupies 32 bit, width is 32
        int myValue= 1000;

        int myMinIntVal=Integer.MIN_VALUE;
        int myMaxIntVal= Integer.MAX_VALUE;

        System.out.println("Integer Mininmum Value= "+ myMinIntVal);
        System.out.println("Integer Maximum Value= "+ myMaxIntVal);

//        overflow and under flow in java,  adding more numbers than java data can hold,
        System.out.println("Busted minimun Value = "+ (myMinIntVal-1));
        System.out.println("Busted maximum Value = "+ (myMaxIntVal+1));


//        Byte Type occupies 8 bit width is 8

        byte myMinByte=Byte.MIN_VALUE;
        byte myMaxByte= Byte.MAX_VALUE;
        System.out.println("Byte Mininmum Value= "+ myMinByte);
        System.out.println("Bye Maximum Value= "+ myMaxByte);


//        Short Type occupies 16 bit width is 16
        short myMinShort= Short.MIN_VALUE;
        short myMaxShort= Short.MAX_VALUE;

        System.out.println("Short Mininmum Value= "+ myMinShort);
        System.out.println("Short  Maximum Value= "+ myMaxShort);


//        Long Type occupies 64 bit, withd 64
        Long myLongValue = 5000L;
        Long myMinLong= Long.MIN_VALUE;
        Long myMaxLong= Long.MAX_VALUE;

        System.out.println("Long Mininmum Value= "+ myMinLong);
        System.out.println("Long  Maximum Value= "+ myMaxLong);

//        Casting

        int myTotal= (myMinIntVal/2);
        System.out.println("Divided "+  myTotal);
        // casting into to Byte
        byte myNewByteValue= (byte)(myMaxByte/2);
        System.out.println("Casted to byted: "+ myNewByteValue);

//        Float and Double Numbers, Floating Point Numbers
//        single precision 32 bit and double precision 64 bit

//        Float
        float myMinFloatValue= Float.MIN_VALUE;
        float myMaxFloatValue= Float.MAX_VALUE;

        System.out.println("Float Mininmum Value= "+ myMinFloatValue);
        System.out.println("Float  Maximum Value= "+ myMaxFloatValue);

//            Double
        Double myMinDoubleValue= Double.MIN_VALUE;
        Double myMaxDoubleValue= Double.MAX_VALUE;

        System.out.println("Double Mininmum Value= "+ myMinDoubleValue);
        System.out.println("Double  Maximum Value= "+ myMaxDoubleValue);


//         Declaring
        int myInt=5;
        float myFloat= 5.3f;  // (float) 5.3;
        double myDouble= 2.33;


//        double operations
        double numberOfPounds=20d;
        double convertedKilograms= numberOfPounds * 0.45359237d;

        System.out.println("Converted Kilograms = "+ convertedKilograms);

        double pi= 3.1415927d;
        double anotherNumber= 3_000_000.4_567_890d;
        double multipliedNumber= pi* anotherNumber;
        System.out.println("Multiplied Number= "+ multipliedNumber);



//        Char and Boolean
//        Char can only save single Character
        char myChar='H';
        char myUnicodeChar= '\u0044';
        char myCopyRightChar= '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println("Copy Right Char= "+ myCopyRightChar);


//        Boolean either Ture or False;

        boolean myTrueBoolean= true;
        boolean myFalseBoolean= false;
        boolean greaterOrNot= 5>6;

        System.out.println("True = "+ myTrueBoolean);
        System.out.println("False = "+ myFalseBoolean);
        System.out.println(" Is 5 greater than 6 " + greaterOrNot);


//        String => a sequence of character, not a primitive data type, it's a class so object

        String myString= "This is String";
        System.out.println("myString equals to => " + myString);

        String numberString ="200.23";
        String secondNumberString ="300.43";

        System.out.println("Numbers on String are string "+ (numberString+secondNumberString));

//        Adding int to strings.
//        Strings in Java are Immutable.
        int mInt=50;
        String lastString = "10"+ mInt;
        System.out.println("Adding int to String "+ lastString);


//        Operands and Operators in Java.
        int result = 1+2 ;//  1+ 2= 3 => Expression, = => assignment operator, + => addition operator
        System.out.println( "1+2 = "+ result);
        int prevResult= result;
        System.out.println("Previous Result " + prevResult);
        result=result-1;
        System.out.println( "3-1 = "+ result);
        System.out.println("Previous Result " + prevResult);

        // multiplication
        result= result *10; // 2 *10 =20;
        System.out.println( "2*10 = "+ result);

         // Division
        result= result /5; // 20 /5 =4;
        System.out.println( "20/5 = "+ result);

        // Modulus  Remainder
        result= result % 3; // 4 %3 =1;
        System.out.println( "4 % 3 = "+ result);


        // result = result+1
        result++;  // 1+1=2
        System.out.println("1+1= "+ result);
        // result =result-1
        result--; // 2-1=1
        System.out.println("2-1= "+ result);

       // result =result +2;
        result+=2; //1+2=3
        System.out.println("1+2= "+ result);
        // result =result *10;
        result*=10; // 3*10=30
        System.out.println("3*10= "+ result);

        // result =result /3;
        result/=3 ; // 30/3 =10
        System.out.println("30/3= "+ result);

        // result =result %3;
        result%=3 ; // 10%3 =1
        System.out.println("10 % 3= "+ result);


//        If - then statement (Conditionals  loop)
//        Always use code block
        boolean isAlien=false;
        if(isAlien == false){
            System.out.println("He is not Alien !");
        }else{
            System.out.println("He is Alien !");
        }

        isAlien =true ;
        if(isAlien){
            System.out.println("Now he is Alien !!! ");
        }


//        Logical OR (||) operator and AND  (&&) operator
        // sing | and &  are bitwise operator working at the bit level
         int topScore=80;
        if(topScore<100){
            System.out.println("You got high Score");
        }
        int secondTopScore= 81;
        // And requires both conditions to be True
        if( (topScore>80) && (secondTopScore<100)){
            System.out.println("Greater than second top scorer and less than 100");
        }

        // OR requires either to be True

        if((topScore>90) || secondTopScore<=90){ // false || true
            System.out.println("Either or Both of conditions are True");
        }

//        Short-hand.,  Ternary Operator ? : .
        boolean isCar=false;
        boolean wasCar=isCar?true:false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

//        Operator Challenge.
        double first= 20.00;
        double second= 80.00;

        double addMutlitply= (first + second) *100.00;
        System.out.println("Adding first and second and multiply by 100 gives :"+ addMutlitply);
        double remainderAfter= addMutlitply%40.00;
        System.out.println("Getting remainder of third step value divided by 40 gives: " + remainderAfter);

        boolean check= remainderAfter ==0 ?true:false;
        System.out.println(" Remainder 0 or not:  "+ check);

        if(check){
            System.out.println("No remainder");
        }else{
            System.out.println("Got some remainder "+remainderAfter);
        }

    }
}
