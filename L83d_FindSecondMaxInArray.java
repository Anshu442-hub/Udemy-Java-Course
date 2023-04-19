package com.company;

public class L83d_FindSecondMaxInArray {
    public static void main(String[] args) {
        int []a={3,9,7,8,12,6,15,5,4,10};
        int first=a[0];
        int second=a[0];
        for (int i = 0; i < a.length; i++) {
            if (first<a[i]){
                second=first;
                first=a[i];
            } else if (second<a[i]) {
                second=a[i];
            }

        }
        System.out.println("First : "+first);
        System.out.println("Second : "+second);
    }
}
