package com.company;
class Rectangle11f {
    private double length;
    private double breadth;

    //getter and setter method
    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l > 0 ? l : 0;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b){breadth = b > 0 ? b : 0;}

    // Constructors overloading

    //If we create an object without passing any parameter
    //then this constructor will be called and l=1 and b=1
    public Rectangle11f(){
        length=1;
        breadth=1;
    }

    //If we create an object with passing two parameter
    //then this constructor will be called
    public Rectangle11f(double l, double b){
        setLength(l);
        setBreadth(b);
    }

    //If we create an object with passing one parameter
    //then this constructor will be called
    public Rectangle11f(double s){
        length=breadth=s;
    }

    public double area() {
        return length*breadth;
    }

    public double perimeter() {
        return length ==0 || breadth ==0 ? 0: 2*(length+breadth);
    }

    public boolean isSquare() {
            return length==breadth;
    }

}
public class Section11f_Constructors {
    public static void main(String[] args) {
        Rectangle11f r1=new Rectangle11f();
        Rectangle11f r2=new Rectangle11f(10.0,5.0);
        Rectangle11f r3=new Rectangle11f(10.0);
        Rectangle11f r4=new Rectangle11f(-10,5);//for validating

        System.out.println("Area1 : "+r1.area());
        System.out.println("Area2 : "+r2.area());
        System.out.println("Area3 : "+r3.area());
        System.out.println("Area4 : "+r4.area());
        System.out.println("---------------------------");
        System.out.println("Perimeter1 : "+r1.perimeter());
        System.out.println("Perimeter1 : "+r2.perimeter());
        System.out.println("Perimeter1 : "+r3.perimeter());
        System.out.println("Perimeter1 : "+r4.perimeter());
        System.out.println("---------------------------");
        System.out.println("Is square? : "+r1.isSquare());
        System.out.println("Is square? : "+r2.isSquare());
        System.out.println("Is square? : "+r3.isSquare());
        System.out.println("Is square? : "+r4.isSquare());

    }
}
