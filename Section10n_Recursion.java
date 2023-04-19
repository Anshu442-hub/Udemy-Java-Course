package com.company;

public class Section10n_Recursion {
    public static void main(String[] args) {
        functionA(3);
        System.out.println("------------");
        functionB(3);
    }
    static void functionA(int n){
        if(n>0){
            System.out.println(n);//first value was printed
            functionA(n-1);//then function is called
        }
    }

    static void functionB(int n){
        if(n>0){
            functionB(n-1);//first function is called
            System.out.println(n);//then value was printed

        }
    }




}
