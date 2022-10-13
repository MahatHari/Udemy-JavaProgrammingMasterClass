package com.harimahat;

import java.sql.SQLOutput;
import java.sql.Wrapper;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /** Operators */
        // Operator Precedence, Postfix ++,--, Prefix/unary + - ~ ! Multiplicative * / %
        // Additive + -
        // Shift << >> >>>
        // Relational <> <= >= instanceof
        // Equality == !)
        // Bitwise and logical bitwise and->& bitwise nor->^  bitwise or->|  logical and -> &&  logical or-> ||
        // Conditional ? :
        //  Assignment =, +=. -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>= Lowest Precedence

        /** Key Concepts on Operations */
        // 1. Expression -> 2+3
        // 2. L-values ->  x= 2+3;  x=5 assignability makes these L-values (Left side of assignment)
        // 3. Side effects x=3, ++x -> Alter l-values (left values ) after ++x. x is altered to 4;

        /** What Happens ? */
        int i= 99;
        System.out.println(++i); // will print 100; => side effect, value of i changed before it is accessed
         i= 99;
        System.out.println(i++); // will print 99;  value of i is accessed and then incremented, after printing, value of i is 100;

        i=99;
       // System.out.println(++i++);// is error, as i++ does not have L-value

        /** Operand Evaluation*/
        // Operands are evaluated Left to right
        // Before performing operation
        // Side effects take place during operand evaluation
        /** What Happens ? */
        int x=1;
        int z;
        try{
            z=100/--x; // 100/0 => throws exception
        }catch (Exception e){
            System.out.println("Bang");
        }
        System.out.println(x);  // prints 0,  predecrement of x in z= 100/--x

        // Remainder Operator %
        /** Remainder is not mod/modulus,  */
        // 7%4 gives 3, for either remainder or mod
        // This changes with negative numbers
        //1. 7 % 3 => 1
        // 2. -7 % 3 => -1
        // 3. 7 % -3 => 1
        // 4. -7 % -3 => -1
        // So remainder operator takes sign from left-hand side.

        /** What Happens ? */
        int [] ia = {0,1,2,3};
        int idx= (int)(Math.random()*101)-50; // gives random in range of +/-50
       // System.out.println(ia[idx%ia.length]); // sometimes gives ArrayIndexOutOfBoundsException, as idx is sometimes negative



        /** Equality Testing Operators*/
        // using == and !=, works with primitive expressions and less useful with reference types
        // Object.equals(Object o) uses == if not overridden.
        // If overridden, equals method should provide "equivalence" test

        // Short Circuit Evaluation
        // true or <anything> -> true
        // false and <anything> -> false
        // && and  || operators do not evaluate the second operand if the result is definite from the first operand.

        // By contrast, & and | operators always evaluate both side.

        // Assignment Operators
        // <l-value> <op>= <expression> => translates to => <l-value>= <l-value> <op> <expression>
        // Precedence order , ++, *, -, ==, =

        /** What Happens ?*/
        int a= 10;
        System.out.println(a++);  // print 10 then increase a by 1.  a=11;
        System.out.println(++a); // increase a by 1, a=11+1; a=12; then print a;

        String s1= "Hello";  // literal string
        String s2= new String("Hello"); // create a new object, different location
        String s3="Hello"; // literal string, object in same location as s1,
        System.out.println(s1==s2); // prints false, as s2 is a new String
        System.out.println(s1==s3);  // prints true,  s3 is a reference to "Hello"

        int [] ja = {0,1,2,3};
        int b= (int)(Math.random()*6)-3; // -3, 3;
       // System.out.println(ja[b%ja.length]); // sometimes throws  Array out of bound exceptions

        int []ia1={0,1,2,3};
        int [] ia2= {10,20,30, 40};
        int [] ia3=ia1;
        int y=0;
        //System.out.println((ia3=ia2)[x=3]);  // prints 40, as ia3 is assigned ia2, and ia2[3] is 40

        /** Arithmetic Promotions*/
        // Java primitives only provide arithmetic in four types:
        // int, long, float and double
        // Arithmetic binary operators work with two operands of same type
        // => If the operand's type differ or are smaller than int, promotion occurs
        // => Promotions creates a new temporary value with the same value but a different type
        // => Original value is unaffected so variables are not modified.

        /** What Happens ? */
        final  int x1=99;
        byte b1=x1; // SUCCEEDS, as byte is 0->128
        // However
        int x2=99;
        // byte b2= x; // Fails => as x2 is not final

        final  long x3= 99;
        // byte b3= x3; // Fails => as only permitted for literal or constants on right hand side not larger than ints


        /** Type of Conditional Expression */
        // The type of a conditional expression <boolean>? <v1>:<v2> is a bit more complex
        // => If both operands (v1 v2) have the same type, the expression has that type
        // => if they differ, promotions or conversions will be needed
        // =>  if the operand types differ, categorize the overall type
        // => boolean, numeric, or reference

        // * For Boolean /Numeric categories,result is a primitive type
        // => that is unboxing occurs
        // example => ..? boolean :Boolean, type is boolean type (not Boolean)
        // and ... ? Integer: Double,  type is double

        // ** Numeric Conditional Expression Type
        // -> The type will be primitive
        // -> The type will be the smallest type that reliably holds the result.
        // --> This is different from arithmetic promotion
        // --> byte: short produces a short not an int
        // --> Note that there is no arithmetic in the conditional operator.
        // --> Constant expressions of exactly int type can be fit into smaller types fi the other argument is suitable
        // What's the type of following expression ?
        System.out.println((true?Double.valueOf(3.1).getClass():Integer.valueOf(3))); // double
        short s= 10;
        System.out.println( true ? 3 :s);  // type is short

        final int s10=10;
        byte b128=127;
        System.out.println(true?b:s); // type is byte

        final short sh=10;
        byte b127=127;
        System.out.println(true?b:s); // type is short as, down sizing happens only for int.

        /** Casting Lambda Expression */
        // The type of a lamda expression is determined from "context"
        // Predicate<String> ps= s->s.length()>3;
        // Context can be a cast like this:
        // (Predicate<String>)s->s.length()>3;

        /** Wrapper classes */
        // -> The packange java.lang has wrappers for all 8 primitive types
        // -> There is also a class Void but that does not wrap anything, has no instances and only null is assignable
        // The names:
        // All start with a capital. Integer, Character are full words, Other Wrappers use their primitive's name with the first letter Capitalized

        /** WrapperFeatures
         *   Wrapper Provides
         *  -> A reference type that contains a primitive
         *  -> A "home" for primitive-related data and Functions
         *  When using the wrapper as an object that contains a primitive, the compiler will automatically generate code to:
         *  -> Create a wrapper type from a primitive expression
         *  -> Extract the primitive value from a wrapper object
         *  List <Integer>  is OK but List<int> is not valid.
         *  These are valid
         *  Integer intg =99;
         *  int i = intg;
         *  long l= intg; -> unwrapped and do necessary promotion
         *  Object ob = i;
         *  However this is not valid, Long bad =99;
         * */

        /** Get Familiar Wrapper API*/
        // Numeric Wrapper(Not Boolean and Character) Provide:
        //  =>Value extraction, eg. intValue(), doubleValue()
        //  =>Comparisons : static int compare(a,b), compares primitives.
        //  =>int compareTo(b) compares with another wrapper
        // Conversion to/from String. example. Double.toHexString()
        // Float and Double parse methods can parse "Infnity" "+Infinity" , "-Infitnity" and "NaN", but other strings are rejected with number format exceptions.
        // Methods isNaN, isFinite, isInfinite test for these special cases.
        // Nan is neither finite nor infinite.

        /*** Questions */
        // Q. What method extras a primiteve float type value from an Integer Object ?
        // Ans: Integer.floatValue();
        // Q. How many Arguments, and of what type, does this method take ?
        // Integer.compare
        // Answer: 2, of primitive int type

        // What's the effect?
        Integer intg1= Integer.valueOf(0);
       //  System.out.println(intg1.booleanValue()); // The Code does nto compile

        System.out.println(Double.isNaN(Double.parseDouble("NaN"))); // True
        System.out.println(Double.isFinite(Double.parseDouble("NaN"))); //False
        System.out.println(Double.isInfinite((Double.parseDouble("NaN")))); //False



    }
}
