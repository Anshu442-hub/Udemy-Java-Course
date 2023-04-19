package com.company;


public class L174c_FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("Message : "+e);
        }
        finally {
            System.out.println("Final message");
        }
    }
}
