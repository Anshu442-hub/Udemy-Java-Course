package com.company;
class Rectangle11c {
    // change to private ,now data is hidden -
    // we cannot access this property outside this Rectangle class
    //but accessible to the methods inside the class Rectangle
    private double length; //private
    private double breadth; //private
    //getter and setter method are property method
    public double getLength() {
        return length;
    }
    public void setLength(double l) {
        length = l > 0 ? l : 0;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double b) {
        breadth = b > 0 ? b : 0;
    }
    public double area() {
        return length*breadth;
    }
    public double perimeter() {
        return 2*(length+breadth);
    }
    public boolean isSquare() {
        return length==breadth;
    }
}
public class Section11c_DataHiding {

    //Usually properties of class are made hidden and methods are made visible
    public static void main(String[] args) {
        Rectangle11c r=new Rectangle11c();

        //Cannot do this as length and breadth are properties
        //are made private(hidden) hence cannot be used outside the class Rectangle
//        r.length= 10.5;
//        r.breadth=5.5;
//        System.out.println("Length "+r.length);
//        System.out.println("Breadth "+r.breadth);

        //property method is used to access the hidden data
        r.setLength(10.5);
        r.setBreadth(5.5);
        System.out.println("Length : "+r.getLength());
        System.out.println("Breadth : "+r.getBreadth());
        System.out.println("Area : "+r.area());
        System.out.println("Perimeter : "+r.perimeter());
        System.out.println("Is Square : "+r.isSquare());

    }

}
