package com.company.package2;

import com.company.package1.Demo1;

public class Demo5 { //non subclass in another package
    //non subclass within another package cannot directly access the
    // members of class within another package
//    public void show() {
//        System.out.println(a);  //default : not accessible to sub class within another package
//        System.out.println(b); //private : not accessible to sub class within another package
//        System.out.println(c); //protected : accessible to sub class within another package
//        System.out.println(d); // public : accessible to sub class within another package
//    }

    //non subclass  can access the members (only the public members)
    // of Demo1 class (a class in another package)
    //by creating an object of class Demo1(a class in another package)
    //Private protected default are not accessible by the class outside the package
    Demo1 d1=new Demo1();
    public void show() {
//        System.out.println(d1.a);  //default : not accessible to non subclass within another package
//        System.out.println(d1.b); //private : not accessible to non subclass within another package
//        System.out.println(d1.c); //protected : accessible to non subclass within another package
        System.out.println(d1.d); // public : accessible to non subclass within another package
    }
}
