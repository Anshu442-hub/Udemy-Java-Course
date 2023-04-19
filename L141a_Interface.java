package com.company;
abstract class Test141a{ //abstract classs
    abstract public void meth1(); //abstract method
    abstract public void meth2(); //abstract method
}
class MyTest141a extends Test141a{ //concrete class
    public void meth1(){
        System.out.println("meth1 of MyTest Class");  //concrete method
    }
    public void meth2(){
        System.out.println("meth2 of MyTest Class");  //concrete method
    }
}
public class L141a_Interface {
    public static void main(String[] args) {
        Test141a t; // reference of abstract class
//        t=new Test141a() ;// object of abstract class cannot be created

        t=new MyTest141a() ; // object of concrete class
        t.meth1();
        t.meth2();
    }
}
//When we have such an abstract class which
// have only abstract method and no concrete method
// we should create an interface