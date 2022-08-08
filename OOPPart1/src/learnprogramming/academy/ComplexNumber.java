package learnprogramming.academy;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double r, double i){
        this.real+=r; this.imaginary+=i;
    }
    public void add (ComplexNumber n){
        this.real+=n.getReal(); this.imaginary+=n.getImaginary();
    }
    public void subtract(double r, double i){
        this.real-=r; this.imaginary-=i;
    }
    public void subtract (ComplexNumber n){
        this.real-=n.getReal(); this.imaginary-=n.getImaginary();
    }
}
