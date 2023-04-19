package com.company;

public class L167a_Exception {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=0;
        c=a/b; //termination of program due to Arithmetic exception
        System.out.println(c);
        System.out.println("End of program");
        System.out.println("Bye");
        //We want even in case of exception program should run completely
    }
}
