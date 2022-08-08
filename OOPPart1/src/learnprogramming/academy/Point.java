package learnprogramming.academy;

public class Point {
    private int x ;
    private  int y;

    public Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt((x*x)+ (y*y));
    }
    public double distance(int xb, int yb){
        return Math.sqrt((xb-x)*(xb-x)+(yb-y)*(yb-y));
    }
    public double distance(Point b){
        return  Math.sqrt(((b.getX()-x)*(b.getX()-x ))+((b.getY()-y)*(b.getY()-y)));
    }
}
