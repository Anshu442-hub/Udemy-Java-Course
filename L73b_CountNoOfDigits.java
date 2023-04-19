package com.company;

import java.util.Scanner;

public class L73b_CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n= sc.nextInt();
        int m=n;
        int c=0;
        while (n>0){
            n=n/10;
            c=c+1;
        }
        System.out.println("No of digits in "+m+" are "+c);

    }
}
