package com.company;
interface Test142a{ //interface : it makes all method abstract by default
    void meth1();
    void meth2();
}
//1) replace extends with replace + override all abstract method
//class MyTest142a implements Test142a{ //concrete class
//    public void meth1(){
//        System.out.println("meth1 of MyTest Class");  //concrete method
//    }
//    public void meth2(){
//        System.out.println("meth2 of MyTest Class");  //concrete method
//    }
//}

//2) replace extends with replace + make class abstract
abstract class MyTest142a implements Test142a{ //abstract class
}

//Interfaces are implemented and not extended
//1) replace extends with replace + override all abstract method
//2) replace extends with replace +make class abstract
public class L142a_PractisingInterface {
    public static void main(String[] args) {

    }
}
