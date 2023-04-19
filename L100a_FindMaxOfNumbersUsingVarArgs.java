package com.company;

public class L100a_FindMaxOfNumbersUsingVarArgs {
    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));
    }

    static int max(int ...a){
        if (a.length==0) return Integer.MIN_VALUE;
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            max=Math.max(a[i],max);
        }
        return max;
    }
}
