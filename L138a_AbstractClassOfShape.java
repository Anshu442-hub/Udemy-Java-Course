package com.company;
abstract class Shape{ //abstract class
    public Shape(){
        System.out.println("Constructor of Shape");
    }
    abstract public double perimeter(); //abstarct method
    abstract public double area(); //abstarct method
}

class Circle extends Shape{  //concrete class
    public double radius;
    public Circle(){
        System.out.println("Constructor of Circle");
    }
    public double perimeter(){
        return 2 * Math.PI *radius;
    } //concrete method
    public double area(){
        return 2 * Math.PI *radius *radius;
    } //concrete method

}

class Rectangle extends Shape{  //concrete class
    public double length;
    public double breadth;
    public Rectangle(){
        System.out.println("Constructor of Rectangle");
    }
    public double perimeter(){
        return 2* (length+breadth);
    } //concrete method
    public double area(){
        return  length* breadth;
    } //concrete method

}
public class L138a_AbstractClassOfShape {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=10;
        r1.breadth=10;
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("Area : "+r1.area());
        System.out.println("-----------------------------");
        Shape s1=r1;
        System.out.println("Perimeter : "+s1.perimeter());
        System.out.println("Area : "+s1.area());
        System.out.println("-----------------------------");
        Circle c1=new Circle();
        c1.radius=5;
        System.out.println("Perimeter : "+c1.perimeter());
        System.out.println("Area : "+c1.area());
        System.out.println("-----------------------------");
        Shape s2=c1;
        System.out.println("Perimeter : "+s2.perimeter());
        System.out.println("Area : "+s2.area());
        System.out.println("-----------------------------");
    }
}
