package com.company;

import java.util.Scanner;

public class L94a_MethodToFindPrimeNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no : ");
        int n=sc.nextInt();

        if(isPrime(n))
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is not Prime");

    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if( x % i == 0)return false;
        }
        return true;
    }
}
