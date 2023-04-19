package com.company;

import java.io.FileInputStream;

public class L171d_HandlingCheckedException {
    static void fun1() {
        try {
            FileInputStream f1 = new FileInputStream("My.text");
        }catch (Exception e){
            System.out.println("Message : "+e.getMessage());
            e.printStackTrace();
        }
    }

    static void fun2() {fun1();} //fun2 calls fun1

    static void fun3() {fun2();} //fun3 calls fun2

    public static void main(String[] args) {
        fun3();//main calls fun3
    }
}
