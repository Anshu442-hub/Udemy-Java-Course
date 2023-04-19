package com.company;
interface Test142b{ //interface : it makes all method abstract by default
    void meth1();
    void meth2();
}
class MyTest142b implements Test142b{ //concrete class
    public void meth1(){
        System.out.println("meth1 of MyTest Class");  //overriden method
    }
    public void meth2(){
        System.out.println("meth2 of MyTest Class");  //overriden method
    }
    public void meth3(){
        System.out.println("meth3 of MyTest Class");  // method
    }
}


public class L142b_PractisingInterface {
    public static void main(String[] args) {
        Test142b t; // reference of interface
//        t=new Test142b() ;// object of interface cannot be created

        t=new MyTest142b() ; // object of concrete class
//        t.meth1();
//        t.meth2();
//        t.meth3(); //this method cannot be called

        MyTest142b t2=new MyTest142b();
        t2.meth1();
        t2.meth2();
        t2.meth3();
    }
}
