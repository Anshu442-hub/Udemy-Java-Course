package com.company;
class Circle120a { //Super Class
    public double radius;
    public Circle120a() {
        radius=1.0;
    } //Constructor
    public double area() {
        return Math.PI * radius *radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
class Cylinder120a extends Circle120a { //Sub class : Cylinder class borrows the features of Circle class
    public double height;
    public Cylinder120a() {
        height=1.0;
    } //Constructor
    public double volume() {
        return area()*height;
    }

}
public class L120a_WritingClassesInInheritance {
    public static void main(String[] args) {
        Circle120a c1=new Circle120a();
        c1.radius=7.0;
        Cylinder120a cy1=new Cylinder120a();
        cy1.radius=7.0;

        System.out.println("----------Circle-------------");
        System.out.println("Radius : "+c1.radius);
        System.out.println("Area : "+c1.area());
        System.out.println("Perimeter : "+c1.perimeter());
        System.out.println("----------Cylinder-------------");
        //Everything from Circle calss is available to
        // Cylinder class but not accessible
        System.out.println("Radius : "+cy1.radius);
        System.out.println("Height : "+cy1.height);
        System.out.println("Area : "+cy1.area());
        System.out.println("Perimeter : "+cy1.perimeter());
        System.out.println("Volume : "+cy1.volume());
    }
}
