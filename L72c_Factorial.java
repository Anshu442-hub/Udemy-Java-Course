package com.company;

import java.util.Scanner;

public class L72c_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n= sc.nextInt();
        int fact=1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial is : "+fact);
    }
}
