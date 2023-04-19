package com.company;
class Circle121a { //Super Class
    public double radius;
    public double area() {
        return Math.PI * radius *radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double circumference() {
        return perimeter();
    }
}
class Cylinder121a extends Circle121a { //Sub class
    public double height;
    public double volume() {
        return area()*height;
    }
}

public class L121a_CircleAndCylinderInheritance {
    public static void main(String[] args) {
        Circle121a c1=new Circle121a();
        c1.radius=7.0;
        Cylinder121a cy1=new Cylinder121a();
        cy1.radius=9.0;
        cy1.height=10.0;

        System.out.println("Radius : "+c1.radius);
        System.out.println("Area : "+c1.area());
        System.out.println("Perimeter : "+c1.perimeter());
        System.out.println("Circumference : "+c1.circumference());
        System.out.println("----------------------------------");
        //Everything from Circle calss is available to
        // Cylinder class but not accessible
        System.out.println("Radius : "+cy1.radius);
        System.out.println("Height : "+cy1.height);
        System.out.println("Area : "+cy1.area());
        System.out.println("Perimeter : "+cy1.perimeter());
        System.out.println("Circumference : "+cy1.circumference());
        System.out.println("Volume : "+cy1.volume());

    }

}
