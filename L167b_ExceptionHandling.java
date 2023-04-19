package com.company;

public class L167b_ExceptionHandling {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=0;
        try {
            c = a / b; //error : arithmetic exception
            System.out.println(c);
        }catch (ArithmeticException e){ //e : is the object for exception
            System.out.println("Divide by zero : "+e);
        }
        System.out.println("End of program");
        System.out.println("Bye");
    }
}
