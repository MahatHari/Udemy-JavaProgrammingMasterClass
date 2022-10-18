import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private  String myNumber;
    private ArrayList <Contact> myContacts;
    private Scanner scanner;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contact>();
        this.myNumber= myNumber;
        scanner= new Scanner(System.in);
    }

    public void printContacts(){
        if(myContacts.size()>0){
        for(Contact contact : myContacts ){
            System.out.print("Name : "+ contact.getName());
            System.out.print(" Phone Number : "+ contact.getPhoneNumber()+"\n");
        }
        }else{
            System.out.println("Your Contact list is empty");
        }
    }
    public ArrayList<Contact> getContacts() {
        return myContacts;
    }


    private  int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private  int findContact(String contactName){
        for( int i=0; i<this.myContacts.size(); i++){
            Contact contact= this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public  boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return  true;
    }

    public  boolean updateContact(Contact oldContact, Contact newContact){
        int foundContactPosition= findContact(oldContact);
        if(foundContactPosition<0){
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }else if(findContact(newContact.getName())!=-1){
            System.out.println(" Contact with name "+ newContact.getName() +" already exists, Update was not successful");
            return false;
        }
        this.myContacts.set(foundContactPosition, newContact);
        System.out.println( oldContact.getName()+ " is replaced with "+ newContact.getName());
        return true;
    }
    /*public  boolean removeContact(String name){
        int foundPosition=findContact(name);
        if(foundPosition<0){
            System.out.println(name+ " does not exist on contacts.");
            return  false;
        }
        System.out.println(name+ " is deleted.");
        this.myContacts.remove(foundPosition);
        return  true;
    }*/
    public  boolean removeContact(Contact contact){
        int foundPosition=findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+ " does not exist on contacts.");
            return  false;
        }
        System.out.println(contact.getName()+ " is deleted.");
        this.myContacts.remove(foundPosition);
        return  true;
    }
    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){
        int position= findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }
}
