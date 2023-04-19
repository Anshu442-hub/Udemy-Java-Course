package com.company;

public class L174d_FinallyDemo {
    static void meth1()throws  Exception{
        try{
            throw new Exception();
        }
        finally {
            System.out.println("Final message");
        }
    }

    public static void main(String[] args) throws Exception {
        meth1();
    }
}
//If a method is just throwing exception and not handling it
//then if we want something to be executed compulsariliy
//then we can use finally block
