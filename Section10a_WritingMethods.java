package com.company;

public class Section10a_WritingMethods {
    public static void main(String[] args) {//main method is static method
        int a=10,b=15,c;
        c=max1(a,b);
        System.out.println(c);
    }

    //main method is static and it can call only static methods
    static int max1(int x,int y){
        return x>y?x:y;
    }

//    //main method is static and it cannot call non static methods
//    int max1(int x,int y){
//        return x>y?x:y;
//    }


}
