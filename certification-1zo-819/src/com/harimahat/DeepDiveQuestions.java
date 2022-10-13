package com.harimahat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class DeepDiveQuestions {
    public static void main(String[] args) {

        /** Questions Deep Dive */
        // Question What is the result
        int i=0;
        int [] ia= new int[]{0,1,2,3};
        // ++i =1, second ++i make i=2, so ia[2]+ia[2]
        ia[++i]=ia[++i]+ia[i];
        System.out.println(Arrays.toString(ia));

        // Suppose this One, Here ia[++i] is evaluated only once because of +=;
        i=0;
        ia= new int[]{0,1,2,3};
        ia[i++] +=ia[i];
        System.out.println(Arrays.toString(ia));
        System.out.println("\b\u7231");

        /** Common Text (String and StringBuilder) Methods*/
        //-> String and String builder implement Comparable
            // => compareTo()
        // -> Both implement charSequence
        //-> char charAt(int)
        //-> IntStream chars() [also codePoints()]
        // -> isEmpty()
        // length()
        // CharSequence, subSequence(int, int)
        // getChars -copy partial text into an array
        // code point variations
        // indexOf /lasIndexOf variations
        // substring variations => always returns string
        // Get Familiar with String and String Builder

        /** String Pooling*/
        // String literals and constant expression are pooled.
        // Strings are immutable, so identical text can be shared;
        // Compiler spots duplicates,
        // Class loader spots duplicates
        // Automatic behavior is only with literals and constants expressions
        // -> intern() method find or puts a String into the pool
        String s1= "Hello";
        String s2= "Hello";
        String s3="He";
        String s4=s3+"llo";
        System.out.println("s1==s2 "+ (s1==s2));
        System.out.println("s1==s4 "+( s1==s4));
        s4=s4.intern();
        System.out.println("s1==s4 "+( s1==s4));
        /** Overview of String Methods*/
        // Initializations from arrays and other text but not from "size"
        // Making new Strings: concat, copyValueOf, format, join, repeat, replace[All/First], valueOf,
        // Extractors: getBytes, toCharArray
        // Comparisons: compareTo[IgnoreCase], contentEquals[IgnoreCase]
        // Tests: contains, endsWith, isBlank, isEmpty, matches, regionMatches, startsWith
        // Case to[Lower/Upper]Case
        // Cleanup, trim, strip[Leading/Trailing]

        /** Methods of String Builder Class */
        // StringBuilder can be constructed from any CharSequence, but also with an int argument
        // -> This specifies "capacity"
        // capacity(), ensureCapacity(int), trimToSize(), Related method=> setLength(int)
        // append(<many types>) // allows changing the text contents
        // delete (int, int) // range form int to int exclusive )
        // deleteCharAt(int)
        // insert(int <many types>)
        // reverse()
        // replace(int, int, string)
        // setCharAt(int,

        /** Questions */
        // Whats the result of following code
        int i2=0;
        String s= "Values: ";
        loop: while(i2<5){
            if( i2++ %2 !=0) continue  loop;

             s.concat(", ")
                    .concat(Integer.toString(i2)); //line n1
        }
        System.out.println(s); // Answer : Values:

        /** Basics of the var PseudoType*/
        // The type of a single, initialized method-local variable or of a lambda parameter,
        // may be specified using var in place of an explicit type
        // -> type is still strongly, statically, unknown and verified
        // -> The declaration must unambiguously define the type
        // -> Var must take the place of the "entire" type
        // -> var has special meaning only where syntax requires a type
        // --> it can still be used as a method or variable name

         /** What Happens ? */
         var x= "Hello ";
        // x=99; // fails, type is now String
        // var z; // cannot infer type without declaration
        // z=99;
      //   var z= {1,2,3}; // Array initializer is not allowed
        var z= new int []{1,2,3}; // This succeeds
        // var [] y = new int[]{1,2,3}; // This fails, var must represent entire type
        // var a=1, b=2 ; // fails, var must be on each time
        /*
        class  X{
            var y=99; // This fails var is not permitted for fields.
        }

        try(var in= Files.newBufferedReader(Path.of("data.txt"))){

        }catch (var e){ // here catch fails-- the exception type is not explicit

        } catch (IOException e) {
            e.printStackTrace();
        }

        public void doStuff(var x){ // var cannot be used for normal methods
            System.out.println(x);
        }


         */

    }
}
