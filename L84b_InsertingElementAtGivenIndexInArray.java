package com.company;

import java.util.Scanner;

public class L84b_InsertingElementAtGivenIndexInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        a[0]=5;
        a[1]=9;
        a[2]=6;
        a[3]=10;
        a[4]=12;
        a[5]=7;
        int l=6;

        System.out.print("Enter Element : ");
        int x=sc.nextInt();
        System.out.print("Insert at Index : ");
        int index=sc.nextInt();

        System.out.print("Original array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = l; i >index; i--) {
            a[i]=a[i-1];
        }
        System.out.print("Intermediate array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        a[index]=x;
        System.out.print("New array : ");
        for (int i = 0; i <l+1; i++) {
            System.out.print(a[i]+" ");
        }





    }
}
