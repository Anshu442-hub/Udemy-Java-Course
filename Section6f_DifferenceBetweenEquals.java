package com.company;
public class Section6f_DifferenceBetweenEquals {
    public static void main(String[] args) {
        //equals()----------compares string
        //== ----------compares references
        String  str1="java";//str1 and str2 refers to same object
        String  str2="java";
        String str3=new String("java");//str3 refers to different object
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);
    }
}
