package learnprogramming.academy;

import java.time.Year;
import java.time.ZoneId;
import java.util.Scanner;

public class UserInput {


    public static void findAge(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Year of Birth: ");

        boolean hasNextInt= scanner.hasNextInt();
        if(hasNextInt){
            int dobYear= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name");
            String name= scanner.nextLine();
            int year= Integer.parseInt(String.valueOf(Year.now(ZoneId.systemDefault())));
            int age = year-dobYear;
            if (age>0 && age<100){
                System.out.println(name + ", You are "+ age + " years old.");
            }else{
                System.out.println("Invalid date of birth");
            }

        }
        scanner.close();


    }

    public static void sumOfTenInputNumbers(){

        int counter=0;
        int sum=0;
        Scanner scanner= new Scanner(System.in);
        while(counter<=5){
            int order=counter+1;
            System.out.println("Enter number # "+ order +": ");
            boolean isAnInt= scanner.hasNextInt();
            if(isAnInt){
                int number= scanner.nextInt();
                sum+=number;

            }else{
                System.out.println("Invalid number");
            }
            counter++;
        }
        scanner.close();
        System.out.println("Sum of all numbers:  " +sum);

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);
        int counter=0;
        int sum=0;

        while(scanner.hasNextInt()){
            sum+=scanner.nextInt();
            counter++;
        }
        long avg = Math.round((double) sum / counter);
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
