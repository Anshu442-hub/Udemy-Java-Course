package com.company;

import java.util.Scanner;

public class L94b_MethodToFindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int gcd = findGCD(a,b);
        System.out.println("GCD = "+ gcd);
    }

    private static int findGCD(int m, int n) {
        while (n!=m){
            if (m>n) m=m-n;
            else n=n-m;
        }
        return m ;
    }

}
