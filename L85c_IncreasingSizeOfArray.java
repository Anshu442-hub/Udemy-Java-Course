package com.company;

public class L85c_IncreasingSizeOfArray {
    public static void main(String[] args) {
        int a[]={8,6,10,9,2};
        int b[]=new int[2*a.length];
        System.out.print("A : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Length of array a is :  "+a.length);
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }
        a=b;
        System.out.print("A (after increasing length): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        System.out.println("Length of array a is :  "+a.length);




    }
}
