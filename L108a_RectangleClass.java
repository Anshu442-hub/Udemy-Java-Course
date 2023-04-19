package com.company;

public class L108a_RectangleClass {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=10.5;
        r1.breadth=5.5;

        System.out.println("Length : "+r1.length);
        System.out.println("Breadth : "+r1.breadth);
        System.out.println("Area : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("Is it a Square : "+r1.isSquare());
    }
    static class Rectangle{
        public double length;
        public double breadth;
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
}
