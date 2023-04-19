package com.company;

public class L173a_ThrowThrows {
    static int area(int a,int b) throws  Exception {
        if(a<0|| b<0)
            throw new Exception();
        return a*b;
    }
    static void meth1() throws  Exception{
        System.out.println(area(-10, 8));
    }
    public static void main(String[] args) throws  Exception {
        try {
            meth1();
        }
        catch (Exception e){
            System.out.println("Message : "+e);
        }
    }

}
