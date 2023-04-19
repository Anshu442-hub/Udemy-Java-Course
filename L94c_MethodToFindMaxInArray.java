package com.company;

import java.util.Scanner;

public class L94c_MethodToFindMaxInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int l=sc.nextInt();
        System.out.println("Enter elements of array : ");
        int a[]=new int[l];
        for (int i = 0; i < l; i++) {
            a[i]= sc.nextInt();
        }
        int max=findMax(a);
        System.out.println("Max = "+max);
    }

    private static int findMax(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(arr[i],max);
        }
        return max;
    }
}
