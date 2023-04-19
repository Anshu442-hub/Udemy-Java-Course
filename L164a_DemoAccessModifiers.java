package com.company;


import com.company.package1.Demo1;

public class L164a_DemoAccessModifiers {
    public static void main(String[] args) {
//        //outside class cannot directly access the members of Demo1 class (a class in another package)
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        display();

        //outside class can access the members (only the public members)
        // of Demo1 class (a class in another package)
        //by creating an object of class Demo1(a class in another package)
        //Private protected default are not accessible by the class outside the package
        Demo1 d1=new Demo1();
//        System.out.println(d1.a); //default : not accessible to a class in another package
//        System.out.println(d1.b); //private : not accessible to a class in another package
//        System.out.println(d1.c); //protected : not accessible to a class in another package
        System.out.println(d1.d);  // public : accessible to a class in another package
        d1.display(); // public : accessible to a class in another package

    }
}
