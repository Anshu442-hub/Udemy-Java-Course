package com.company;

import java.util.Scanner;

public class L75c_DisplayGPSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a = ");
        int a= sc.nextInt();
        System.out.print("r = ");
        int r= sc.nextInt();
        System.out.print("n = ");
        int n= sc.nextInt();
        int t=a;
        System.out.print(a+" ");
        for (int i = 1; i < n; i++) {
            t=t*r;
            System.out.print(t+ " ");
        }
    }
}
