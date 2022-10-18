import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private  static GroceryList groceryList= new GroceryList();
    public static void main(String[] args) {
	// write your code here
        // create array
        //int [] intArray= getIntegers(5);
//        int [] intArray= readIntegers(5);
//        for( int i=0; i< intArray.length; i++){
//            System.out.println("Element "+ i + ", typed value was "+ intArray[i]);
//        }
//
//        int [] sorted= sortedArrayIntegers(intArray);
//        System.out.println("Average of array " + getAverage(intArray));
//        System.out.println("Sorted Array "+ sorted);
//
////        Min value
//        int returnedMin= findMin(intArray);
//        System.out.println(returnedMin);
//        Check reverese

        int [] array={1,2,3,4,5};
        reverse(array);
        System.out.println(array.toString());
        for (int j : array) {
            System.out.println(j);
        }

//        Using Grocery Class

        boolean quit=false;
        int choice=0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice= scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                   addItem();
                   break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArray();
                    break;
                case 7:
                    quit= true;
                    break;
                default:
                    break;
            }
        }


    }
    public  static  void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice questions. ");
        System.out.println("\t 1 - To print list of grocery items. ");
        System.out.println("\t 2 - To  add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item  from the list. ");
        System.out.println("\t 5 - To search an item  from the list. ");
        System.out.println("\t 6 - To quit the application. ");
    }

    public static  void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public  static  void modifyItem(){
        System.out.print("Enter item number: ");
        String currentItem= scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem= scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }
    public  static  void removeItem(){
        System.out.print("Enter item : ");
        String itemName= scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }
    public  static  void searchForItem(){

        System.out.println("Item to search for : ");
        String newItem= scanner.nextLine();
        if(groceryList.find( newItem) !=null){
            System.out.println("Found " + newItem+ " in out grocery list");
        }else{
            System.out.println(newItem+" is not in grocery list");
        }
    }
    public static void processArray(){
        // copy ArrayList
        ArrayList<String> newArray= new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        // another way to copy ArrayList to ArrayList
        ArrayList<String > nextArray= new ArrayList<>(groceryList.getGroceryList());
        // converting ArrayList to array
        String [ ] myArray= new String[groceryList.getGroceryList().size()];
        myArray= groceryList.getGroceryList().toArray(myArray);
    }


    public static int [] getIntegers(int number){
        System.out.println("Enter "+ number + "interger values. \r");
        int []values= new int [number];
        for(int i=0; i<number; i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int [] array){
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            sum += j;

        }
        return sum/array.length;
    }

    public static int [] sortedArrayIntegers(int [] array){
        int [] sortedArray= new int [array.length];

        for(int i=0; i<array.length; i++){
            sortedArray[i]=array[i];
        }
        boolean flag= true;
        int temp;
        while(flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }

    private static int [] readIntegers(int count){
        int []array= new int [count];
        for(int i=0; i<count; i++){
            System.out.println("Enter a number: ");
            int number= scanner.nextInt();
            array[i]=number;
        }
        return  array;
    }

    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            int value= array[i];
            if(value<min){
                min=value;
            }

        }
        return min;
    }

    private static void  reverse(int [] array){
        int maxIndex= array.length-1;
        int halfLength= array.length/2;

        for (int i=0; i<halfLength; i++){
            int temp= array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
    }
 }
