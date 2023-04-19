package com.company;

public class Section10b_CallingStaticAndNonStaticMethods {
    public static void main(String[] args) {
        int a1=10,b1=15,a2=100,b2=80;

        int c1=max1(a1,b1); //Calling a static method
        System.out.println(c1);

        Section10b_CallingStaticAndNonStaticMethods myMethod =new Section10b_CallingStaticAndNonStaticMethods();//creating an object
        int c2= myMethod.max2(a2,b2);//CAlling a non static method
        System.out.println(c2);
    }
    //a static method
    static int max1(int x,int y){
        return x>y?x:y;
    }
    //a non static method
    int max2(int x,int y){
        return x>y?x:y;
    }
}
