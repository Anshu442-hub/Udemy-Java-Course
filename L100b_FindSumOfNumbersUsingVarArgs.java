package com.company;

public class L100b_FindSumOfNumbersUsingVarArgs {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(10));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
    static int sum(int ...A){
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            sum=sum+A[i];
        }
        return sum;
    }
}

