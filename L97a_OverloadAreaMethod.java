package com.company;

import java.util.Scanner;

public class L97a_OverloadAreaMethod {
    public static void main(String[] args) {
        System.out.println("1__rectangle");
        System.out.println("2__circle");
        System.out.println("3__trapezium");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter shape no : ");
        int shape=sc.nextInt();
        switch (shape){
            case 1 :{
                System.out.print("Enter length of rectangle : ");
                double l=sc.nextDouble();
                System.out.print("Enter breadth of rectangle : ");
                double b=sc.nextDouble();
                System.out.println("Area : "+area(l,b));
            }
            break;

            case 2 :{
                System.out.print("Enter radius of circle : ");
                double r=sc.nextDouble();
                System.out.println("Area : "+area(r));
            }
            break;

            case 3 :{
                System.out.print("Enter one side  of trapezium : ");
                double a=sc.nextDouble();
                System.out.print("Enter other side  of trapezium : ");
                double b=sc.nextDouble();
                System.out.print("Enter height  of trapezium : ");
                double h=sc.nextDouble();
                System.out.println("Area 4 : "+area(a,b,h));
            }
            break;
            default: {
                System.out.println("invalid");
            }
            break;
        }
    }

     static double area(double l, double b) {
        return l*b;
    }
    static double area(double radius) {
        return Math.PI*radius*radius;
    }
    static double area(double side1, double side2,double height) {
        return 0.5*(side1+side2)*height;
    }
}
