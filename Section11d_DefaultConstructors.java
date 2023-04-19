package com.company;
class Rectangle11d {
    private double length;
    private double breadth;

    //default constructor is provided by default by java compiler
    public Rectangle11d() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double b) {
        breadth = b;
    }
}
public class Section11d_DefaultConstructors {
    public static void main(String[] args) {
        // When we write this a constructor is called
        //that constructor is provided by default by java compiler
        //We do not need to write default constructor
        //Here during the creation of object length and breadth is initialised to 0.0 and 0.o
        Rectangle11d r=new Rectangle11d();
        //and afterwards we set the length and breadth of rectangle object
        r.setLength(5.5);
        r.setBreadth(10.5);
    }

}
