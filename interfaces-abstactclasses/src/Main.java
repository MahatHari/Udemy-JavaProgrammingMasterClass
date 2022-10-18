import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player tim= new Player("Tim", 10, 15);
        System.out.println(tim.toString());

        tim.setHitPoints(8);
        System.out.println(tim.toString());
        tim.setWeapon("Storm bringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);


        ISaveable werewolf= new Monster("Werewolf", 12, 20);
        System.out.println(" Monster Strength: "+((Monster)werewolf).getStrength());
    }

    public static ArrayList<String> readValues() {

        ArrayList <String> values= new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit=false;
        int index=0;
        System.out.println("Choose \n "+
                "1 to enter a string"+
                "0 to quit"
                );
        while(!quit){
            System.out.println("Choose and option");
            int choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit=true;
                    break;
                case 1:
                    while(index<=3){
                        switch (index){
                            case 0:
                                System.out.println("Enter a Player name");
                                String name= scanner.nextLine();
                                values.add(index, name);
                                index++;
                                break;
                            case 1:
                                System.out.println("Enter hit points");
                                String hitPoints= scanner.nextLine();
                                values.add(index, hitPoints);
                                index++;
                                break;
                            case 2:
                                System.out.println("Enter strength");
                                String strength= scanner.nextLine();
                                values.add(index, strength);
                                index++;
                                break;
                            case 3:
                                System.out.println("Enter weapon");
                                String weapon= scanner.nextLine();
                                values.add(index, weapon);
                                index++;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return  values;
    }

    public static  void saveObject (ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");
        }
    }
    public static void loadObject( ISaveable objectToRead){
        ArrayList<String > values= readValues();
        objectToRead.read(values);
    }
}
