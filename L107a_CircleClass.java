package com.company;

public class L107a_CircleClass {
    public static void main(String[] args) {
        Circle c1=new Circle(); //object c1 is created in heap
        Circle c2=new Circle(); //object c2 is created in heap
        c1.radius=7; //initialising radius property
        c2.radius=14; //initialising radius property
        System.out.println("Radius : "+c1.radius); //accessing radius property
        System.out.println("Area : "+c1.area()); //accessing area() method
        System.out.println("Perimeter : "+c1.perimeter()); //accessing perimeter() method
        System.out.println("Circumference : "+c1.circumference()); //accessing circumference() method
        System.out.println("----------------------------------");
        System.out.println("Radius : "+c2.radius); //accessing radius property
        System.out.println("Area : "+c2.area()); //accessing area() method
        System.out.println("Perimeter : "+c2.perimeter()); //accessing perimeter() method
        System.out.println("Circumference : "+c2.circumference()); //accessing circumference() method
    }
    static  class Circle{ //class
        public double radius; //property
        public double area() {  //method
            return Math.PI*radius*radius;
        }
        public double perimeter() { //method
            return 2*Math.PI*radius;
        }
        public double circumference() { //method
            return perimeter();
        }
    }
}
