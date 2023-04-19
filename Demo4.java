package com.company.package2;

import com.company.package1.Demo1;

public class Demo4 extends Demo1 { //subclass of Demo1 within another package
    //subclass within another package can directly access the
    // members(except default and private members)
    // of super class within another package
    public void show() {
//        System.out.println(a);  //default : not accessible to sub class within another package
//      System.out.println(b); //private : not accessible to sub class within another package
        System.out.println(c); //protected : accessible to sub class within another package
        System.out.println(d); // public : accessible to sub class within another package
    }
}
