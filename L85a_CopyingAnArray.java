package com.company;

public class L85a_CopyingAnArray {
    public static void main(String[] args) {
        int a[]={8,6,10,9,2,15,7,13,14,11};
        int b[]=new int[a.length];

        System.out.print("A : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++) {
            b[i]=a[i];
        }

        System.out.print("B : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();


    }
}
