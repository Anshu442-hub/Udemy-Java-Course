package com.company.package1;

public class Demo1 { //class
    int a=10;  //default
    private int b=20; //private
    protected int c=30; //protected
    public int d=40; // public
    public void display(){
        //all members are accessible within same class
        System.out.println(a);  //default : accessible within same class
        System.out.println(b); //private : accessible within same class
        System.out.println(c);  //protected : accessible within same class
        System.out.println(d);  // public : accessible within same class
    }


}
