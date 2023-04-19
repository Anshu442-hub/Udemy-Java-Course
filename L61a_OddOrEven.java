package com.company;

import java.util.Scanner;

public class L61a_OddOrEven {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        n=sc.nextInt();
        if(n%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");

    }
}
