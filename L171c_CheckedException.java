package com.company;


import java.io.FileInputStream;

public class L171c_CheckedException {

    //Checked exception - must be handled else program cannot run
    static void fun1() {
//        FileInputStream f1=new FileInputStream("My.text");
    }

    static void fun2() {fun1();} //fun2 calls fun1

    static void fun3() {fun2();} //fun3 calls fun2

    public static void main(String[] args) {
        fun3();//main calls fun3
    }
}
