package com.company;

import java.util.Scanner;

public class L83b_SearchingForNoDuplicatesInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a={3,9,7,8,12,6,15,5,4,10};
        System.out.print("Enter key to search : ");
        int k=sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k) {
                System.out.println("Element found at index : " + i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");

    }
}
