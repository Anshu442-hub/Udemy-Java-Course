package com.company;

public class L83a_SumOfElementsOfArray {
    public static void main(String[] args) {
        int []a={3,9,7,8,12,6,15,5,4,10};
//        int sum=0;
//        for (int i = 0; i < a.length; i++) {
//            sum=sum+a[i];
//        }
//        System.out.println("Sum = "+ sum);


        int  sum=0;
        for (int i :a) {
            sum=sum+i;
        }
        System.out.println("Sum = "+ sum);
    }
}
