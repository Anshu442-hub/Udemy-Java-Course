package com.company;

import java.util.Scanner;

public class L75d_Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n = ");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a +" "+b+" ");
        for (int i = 0; i < n - 2; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
