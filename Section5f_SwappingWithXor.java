package com.company;

public class Section5f_SwappingWithXor {
    public static void main(String[] args) {
        //Swapping
        int a=9,b=12;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
