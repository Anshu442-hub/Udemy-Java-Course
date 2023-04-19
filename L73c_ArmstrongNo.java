package com.company;

import java.util.Scanner;

public class L73c_ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n= sc.nextInt();
        int m=n;
        int digit,cube;
        int sum=0;
        while (n>0){
            digit=n%10;
            n=n/10;
            cube=digit*digit*digit;
            sum=sum+cube;
        }
        if(sum==m) System.out.println("Armstrong");
        else System.out.println("Not armstrong");
    }
}
