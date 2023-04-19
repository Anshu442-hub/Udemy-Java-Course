package com.company;

////By default members of interface are
//// public and abstract but we can specify also
//interface Test146a {
//    public abstract void meth1();
//    public abstract void meth2();
//}

////Methods of interfaces cannot be made private
//// bcoz they are supposed to be implemented by classes
//interface Test146a {
//    private  void meth1();
//    private  void meth2();
//}


//interface Test146a {
//    //identifiers are by default final and static
//    final static int X =10; //identifiers of an interface should be upper case
//    void meth1();
//}

//interface Test146a {
//    void meth1(){
//        System.out.println();
//    } //Methods of interface cannot have body
//}

////Interface can have method with body only when we declare method as sattic
//interface Test146a {
//    void meth1();
//    static void meth2(){
//        System.out.println("meth2 of Test class");
//    }
//}

//How to access identifiers and static method of an interface
interface Test146a {
    int X =10; //identifiers
    void meth1();//abstract method
    static void meth2(){
        System.out.println("meth2 of Test class");
    }//static method
}

//An interface can extend from another interface
interface MyTest146a {
    void meth1();//abstract method
    static void meth2(){
        System.out.println("meth2 of MyTest class");
    }//static method
}
interface YourTest146a extends MyTest146a {
    void meth3();//abstract method
}
//If  interface  extend from another interface we
// have to override all the abstract methods when we implement it
class ExampleClass implements YourTest146a{
    public void meth1(){System.out.println("Meth1 of ExampleClass ");} //overriding all the abstract method
    public void meth3(){System.out.println("Meth4 of ExampleClass");}//overriding all the abstract method
}


public class L146a_InterfaceDosAndDont {
    public static void main(String[] args) {
        Test146a t1;// reference of interface
        System.out.println(Test146a.X); //accessing identifiers of an interface
        Test146a.meth2(); //accessing static method of an interface

    }
}
