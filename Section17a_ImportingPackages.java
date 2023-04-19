package com.company;
//method1
import java.lang.*;
//method2
import java.lang.String;
public class Section17a_ImportingPackages {
    public static void main(String[] args) {
        String str1=new String("HELLO");
        System.out.println(str1);

        //method3
        java.lang.String str2= new java.lang.String("Hello2");
        System.out.println(str2);
    }
}
