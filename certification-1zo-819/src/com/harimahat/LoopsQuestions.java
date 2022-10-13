package com.harimahat;

import java.util.List;
import java.util.Map;

public class LoopsQuestions {
    public static void main(String[] args) {

        /** While loop*/
        /**
         *   controls a single "statement"
         *   --> but not a declaration
         *   --> usually a block
         *  Might execute zero times
         *  Control expression must be boolean type(cant be truthy or falsy like in js)
         *   --> unboxing is allowed
         *   --> must be inside parenthesis
         * */

        /** Do while */
        // a do while loop also contorls a sing "statement"
        // Executes at least once
        // control expression must be followed by semicolon;

        /** C-Style for loop*/
        /**
         *  for (int x=0; x<3; x++){code block}
         * */

        /** Enhanced-for loop*/
        List<String> names = List.of("Fred","Jim", "hari");
        // An enhanced-for loop takes item individually from "many".
        // "Many" can be an Iterable(List, Set or Array but not Map)
        // Iteration order is determined by the source.
        for(String name :names ){
            System.out.println(name);
        }

        System.out.println("Questions ...");
        /* Questions */
        // What's missing
        Map<String, String> names2= Map.of("Fred", "Jones", "Sheila", "Smith");
        for(String f: names2.keySet()/*What Goes Here */){
            System.out.println(f);
    }
        /* What happens ? */
        List<String> names3= List.of("Fred", "Jim", "Sheila");
        for(String n:names3){
            if("Jim".equals(n)) continue;;
            System.out.println(n);
        }
        // Above code prints all names except Jim

        for (int i = 0; i < 3; i++) {
            System.out.println(i++);
            continue;
           // ++i; unreachable code
        }
        // above code  fails at compilation

        /** Labeled Statements */
        // Java allows a label to be applied to any statement
        talkative:System.out.println("Hello");
        blockOne:{};
        // Labels are mostly useful on loops
       // myLoop:while(true){}
        // Scope of label is the statement that is labeled
        // Namespace is specific to labels
        // Question What happens?
        /*myloop:while (true) {
            System.out.println("something");

        }*/
        System.out.println(4+12);
    }
}
