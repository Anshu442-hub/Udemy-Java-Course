package com.company;

import java.util.Scanner;

public class L61b_YoungOrNot {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age ");
        age=sc.nextInt();
        if(age>=14 && age<=55) System.out.println("Young");
        else System.out.println("Not Young");
    }
}
