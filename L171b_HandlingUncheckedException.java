package com.company;

public class L171b_HandlingUncheckedException {
    static void fun1() {
        try {
            System.out.println(10 / 0);
        } catch (Exception e){
            System.out.println("Message : "+e.getMessage());
            // e.printStackTrace(); will print the stack contents
            //means which method has called which method
            //and where the Exception has raised
            e.printStackTrace();
        }

    }

    static void fun2() {fun1();} //fun2 calls fun1

    static void fun3() {fun2();} //fun3 calls fun2

    public static void main(String[] args) {
        fun3();//main calls fun3
    }
}
