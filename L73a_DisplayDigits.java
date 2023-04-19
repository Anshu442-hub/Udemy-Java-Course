package com.company;

import java.util.Scanner;

public class L73a_DisplayDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n= sc.nextInt();
        int digit=0;
        System.out.println("Digits in "+n+" are ");
        while (n>0){
            digit=n%10;
            n=n/10;
            System.out.print(digit+" ");
        }
    }
}
