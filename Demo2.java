package com.company.package1;

public class Demo2 { //same package non subclass

 //nonsub  class cannot directly access the members of Demo1 class (a class in same package)
//    public void show() {
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//    }

    //nonsub class can access the members (except the private members)
    // of Demo1 class (a class in same package)
    //by creating an object of class Demo1(a class in same package)
    //Private are not accessible by nonsub class of same the package
    Demo1 d1=new Demo1();
    public void show(){
       System.out.println(d1.a); //default : accessible to nonsub class in same package
//     System.out.println(d1.b);  //private : not accessible to nonsub class in same package
       System.out.println(d1.c); //protected : accessible to nonsub class in same package
       System.out.println(d1.d); // public : accessible to nonsub class in same package
    }

}
