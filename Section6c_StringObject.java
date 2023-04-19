package com.company;

public class Section6c_StringObject {
    public static void main(String[] args) {
//        //creating a string
//        //method1 :: Using literal
//        String str1= "Java Program"; //in pool
//        //method2 :: Using character array
//        char c[]={'H','e','l','l','o'};
//        String str2=new String(c); //in heap
//        //method3 :: Using byte  array
//        byte b[]={65,66,67,68};
//        String str3=new String(b); //in heap
//        //method4
//        String str4=new String("Anshu");//in heap
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println(str4);
//
//        //Overloaded methods for Creating strings using Character array
//        char c[]={'H','e','l','l','o'};
//        String str1=new String(c);
//        String str2=new String(c,0,5); // strating index,no of letters
//        String str3=new String(c,1,3); // strating index,no of letters
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);

//        //Overloaded methods for Creating strings using byte array
//        byte b[]={65,66,67,68};
//        String str1=new String(b);
//        String str2=new String(b,2,2); // strating index,no of letters
//        String str3=new String(b,1,2); // strating index,no of letters
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);

//        //Java maintains a string pool
//        String str1 ="Java";
//        String str2 ="Java"; //str1 and str2 refer to same String
//        String str3 ="java"; //str3 refer to different object
//        System.out.println(str1==str2);
//        System.out.println(str1==str3);

//        //new keyword creates object in heap
        String str1 ="Java"; //in pool
        String str2=new String("Java");//in heap
        System.out.println(str1==str2);
    }
}
