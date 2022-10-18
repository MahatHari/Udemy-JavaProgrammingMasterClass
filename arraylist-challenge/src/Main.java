import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("00358 449 882332");

    public static void main(String[] args) {
	// write your code here

        boolean quit=false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action: (6 to show available actions)");
            int action= scanner.nextInt();
            scanner.nextLine();
            quit= menu(action);
        }
    }
    public static boolean menu(int option){
        switch (option){
            case 0:
                shutDown();
                return true;
            case 1:
                printContact();
                return false;
            case 2:
                addNewContact();
                return false;
            case 3:
                updateContact();
                return false;
            case 4:
                removeContact();
                return false;
            case 5:
                searchContact();
                return false;
            case 6:
                printActions();
                return false;
            default:
                return true;

        }
    }

    private static void startPhone(){
        System.out.println("Starting Phone ...");
    }
    private static boolean shutDown(){
             return  false;
    }
    public static void printActions(){
        System.out.println("\nAvailable actions:\n press ");
        System.out.println("0  -  to shutdown\n " +
                " 1 -  to print contacts \n" +
                "2 -  to add a new contact \n "+
                "3 -   to update existing  \n" +
                " 4 - to remove existing contact \n"+
                "5 -  to query if an contact exists \n"+
                "6 -   to print a list of available actions"
        );

    }
    public  static void addNewContact(){
        System.out.println( "Enter new Contact name: ");
        String name= scanner.nextLine();
        System.out.println("Enter phone number :");
        String phone= scanner.nextLine();

        Contact contact = Contact.createContact( name, phone);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("New Contact added "+ name + "Phone: "+ phone);
        }else{
            System.out.println(" Contact already exists");
        }
    }
    public static void printContact(){
        mobilePhone.printContacts();
    }
    public static void updateContact(){
        System.out.println( "Enter new Contact name: ");
        String name= scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact ==null){
            System.out.println("Contact does not exist");
            return;
        }
        System.out.println( "Enter new Contact name: ");
        String newName= scanner.nextLine();
        System.out.println("Enter phone number :");
        String newPhone= scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);

       if(mobilePhone.updateContact(oldContact,newContact)){
           System.out.println("Successfully, Contact Updated");
       }else{
           System.out.println(name + " could not be updated, Error");
       }
    }
    public static  void removeContact(){
        System.out.println( "Enter new Contact name: ");
        String name= scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact ==null){
            System.out.println("Contact does not exist");
            return;
        }
        if(mobilePhone.removeContact(oldContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    public static void searchContact(){
        System.out.println( "Enter new Contact name: ");
        String name= scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if(oldContact==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: "+  oldContact.getName()+ " Phone:  "+ oldContact.getPhoneNumber());
    }
}
