package com.company;
 interface Test141b{ //interface : it makes all method abstract by default
      void meth1();
      void meth2();
}

//class YourTest141b extended Test141b{
//     //Interfaces are implemented not extended
//}
class MyTest141b implements Test141b{ //concrete class
    public void meth1(){
        System.out.println("meth1 of MyTest Class");  //concrete method
    }
    public void meth2(){
        System.out.println("meth2 of MyTest Class");  //concrete method
    }
}
public class L141b_CreatingInterface {
    public static void main(String[] args) {
        Test141b t; // reference of interface
//        t=new Test141b() ;// object of interface cannot be created

        t=new MyTest141b() ; // object of concrete class
        t.meth1();
        t.meth2();
    }
}
