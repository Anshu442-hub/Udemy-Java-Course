package com.company;

public class L101a_FindDiscountUsingVarArgs {
    public static void main(String[] args) {
        System.out.println(discount(100.25,205.55));
        System.out.println(discount(100.00,200.00,400.00));
        System.out.println(discount(2000.25));
    }
    static double discount(double ...P){
        double sum=0,discount=0;
        for (int i = 0; i < P.length; i++) {
            sum=sum+P[i];
        }
        if(sum<500) return discount=sum*0.10;
        else if (sum>=500 && sum<1000) return discount=sum*0.20;
        else return discount=sum*0.30;
    }
}
