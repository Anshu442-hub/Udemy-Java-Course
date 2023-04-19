package com.company;
class LowBalanceException extends Exception { //user defined Exception
    public String toString() { //overridding toString() method
        return "Balance Should not be less than 5000";
    }
}
public class L171e_UserDefinedException {
    static void fun1() {
        try {
            throw new LowBalanceException(); //new object created
        }
        catch(LowBalanceException e) {
            e.printStackTrace();
            System.out.println("Message : "+e);
        }
    }
    static void fun2() {fun1();}

    static void fun3() {fun2();}

    public static void main(String[] args) {fun3();}
}
