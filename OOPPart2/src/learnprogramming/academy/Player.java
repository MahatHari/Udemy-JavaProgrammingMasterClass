package learnprogramming.academy;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public  void losHealth(int damage){
        this.health-=damage;
        if (this.health <= 0) {

            System.out.println("Player knocked out");
        }
    }
    public int healthRemaining(){
        return  this.health;
    }
}
