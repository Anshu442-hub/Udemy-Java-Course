package com.company.package1;

public class Demo3 extends Demo1{ //subclass of Demo1 within same package
    //sub  class can directly access the members(except private members) of Demo1 class (a class in same package)
    public void show() {
        System.out.println(a);  //default : accessible to sub class in same package
//      System.out.println(b); //private : not accessible to sub class in same package
        System.out.println(c); //protected : accessible to sub class in same package
        System.out.println(d); // public : accessible to sub class in same package
    }
}
