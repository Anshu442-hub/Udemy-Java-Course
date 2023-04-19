package com.company;
import java.util.Scanner;
public class L74a_ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n= sc.nextInt();
        int m=n;
        int digit;
        int rev=0;
        while (n>0){
            digit=n%10;
            n=n/10;
            rev=rev*10+digit;
        }
        System.out.println("Reverse of "+m+" = "+rev);
    }
}
