package com.company;

import java.util.Scanner;

public class L72b_SumOf_n_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no ");
        int n= sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+i;
        }
        System.out.println("Sum is : "+sum);
    }
}
