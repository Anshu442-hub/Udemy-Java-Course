package com.company;

public class Section11b_ClassExample {
    public static void main(String[] args) {
        Circle circle=new Circle();
//        Rectangle rect=new Rectangle();
        Cylinder cylinder=new Cylinder();
        Student student=new Student();
        Account acc=new Account();
    }
    static class Circle{
        public  double radius;
        public double area(){
           return Math.PI * radius * radius;
        }
        public double perimeter(){
            return 2 * Math.PI * radius ;
        }
    }

    static class Rectangle{
        public  double length;
        public  double breadth;
        public double area(){
            return length *  breadth;
        }
        public double perimeter(){
            return 2 * (length + breadth) ;
        }
    }

    static class Cylinder{
        public  double radius;
        public  double height;
        public double lidArea(){
            return Math.PI * radius * radius;
        }
        public double volume(){
            return Math.PI * radius* radius* height ;
        }
    }

    static class  Student{
        public  String roll;
        public String name;
        public  String course;
        public  int m1,m2,m3;
        public int total(){
            return m1 + m2 +m3;
        }
        public float average(){
            return total()/2;
        }
    }

    static class Account{
        public long accNo;
        public String name;
        public void deposit(){
            System.out.println("Money deposited");
        }
        public void withdrawal(){
            System.out.println("Money withdrawn");
        }
    }
}
