package com.company;

import java.util.Arrays;

public class L78a_SortingArrayOfString {
    public static void main(String[] args) {
        String s[]={"java","python","pascal","ada"};
        System.out.print("Original array : ");
        for (String x : s ) {
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(s);
        System.out.print("Sorted array : ");
        for (String x : s ) {
            System.out.print(x+" ");
        }
        System.out.println();


    }
}
