package com.company;

import java.util.Scanner;

public class L31_AreaOfTriangle {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        float base,height,area;
//        System.out.println("Enter Base and Height");
//        base=sc.nextFloat();
//        height=sc.nextFloat();
////        area=base*height*0.5f;
//        area=1f/2f*base*height;
//        //area=base*height/2;
//        System.out.println("Area of Triangle is : "+area);

        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,area;
        System.out.println("Enter 3 Sides of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        System.out.println(s);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle is : "+area);
    }
}
