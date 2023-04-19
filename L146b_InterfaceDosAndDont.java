package com.company;
interface Test146b { //interfaces
    int X=10;
    void meth1();//abstract method
    void meth2();//abstract method
    default void meth3()
    {
        System.out.println("Meth3 of Test");
    }//default method
}

interface MyTest146b extends Test146b {//interfaces
    void meth4(); //abstract method
}

// 1)class MyExample implements interface MyTest146b
// may or may not override default method
// 2)class MyExample implements interface MyTest146b
// which inturn extends from  interface Test146b
// so it is mandatory for   class MyExample
// to override all the abstract method
class MyExample implements MyTest146b {
    public void meth1(){System.out.println("Meth1 of MyExample");} //overriden abstract method
    public void meth2(){System.out.println("Meth2 of MyExample");} //overriden abstract method
    public void meth3(){System.out.println("Meth3 of MyExample");} // may or may not overriden method
    public void meth4(){System.out.println("Meth4 of MyExample");} //overriden abstract method
}
public class L146b_InterfaceDosAndDont {
    public static void main(String[] args) {
        Test146b t1; //reference of interface  Test146b
        MyTest146b mt1;//reference of interface  MyTest146b
        MyExample me1; //reference of concrete class  MyExample

        me1=new MyExample(); //object of concrete class  MyExample
        me1.meth1();
        me1.meth2();
        me1.meth3();
        me1.meth4();

    }
}
