package com.company;
public class L171a_UncheckedException {

    //unchecked exception - not necessary to be handled
    static void fun1() {System.out.println(10/0);} //Arithmetic exception is unchecked exception

    static void fun2() {fun1();} //fun2 calls fun1

    static void fun3() {fun2();} //fun3 calls fun2

    public static void main(String[] args) {
        fun3();//main calls fun3
    }

}

