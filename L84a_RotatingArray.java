package com.company;
public class L84a_RotatingArray {
    public static void main(String[] args) {
        int []a={5,9,6,10,12,7,3,5,4,2};
        System.out.print("Original array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        int temp=a[0];
        for (int i = 1; i <a.length ; i++) {
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;

        System.out.print("Rotated array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
