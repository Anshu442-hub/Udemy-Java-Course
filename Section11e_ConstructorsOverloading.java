package com.company;
class Rectangle11e {
    private double length;
    private double breadth;


    //If we create an object without passing any parameter
    //then this constructor will be called and l=1 and b=1
    public Rectangle11e(){
        length=1;
        breadth=1;
    }
    //If we create an object with passing two parameter
    //then this constructor will be called
    public Rectangle11e(double l, double b){
        length=l;
        breadth=b;
    }

    public double area() {
        return length*breadth;
    }

}
public class Section11e_ConstructorsOverloading  {
    public static void main(String[] args) {
        Rectangle11e r1=new Rectangle11e(); //create an object without passing any parameter
        Rectangle11e r2=new Rectangle11e(10,5); //create an object with passing two parameter

        System.out.println(r1.area());
        System.out.println(r2.area());

    }
}
