package com.company;
class Parent12b {
    Parent12b() {
        System.out.println("Non-Param of parent");
    }
    Parent12b(int x) {
        System.out.println("1 Param of parent "+x);
    }
}

class Child12b extends Parent12b {
    Child12b() {
        System.out.println("Non-Param of child");
    }
    Child12b(int y) {
//        super(y);
        System.out.println("1 Param of child");
    }
    Child12b(int a, int b) {
        super(a);
        System.out.println("2 param of child "+a+" and "+b);
    }
}
public class Section12b_ParameterisedConstructorsInInheritance {
    public static void main(String[] args) {
        Parent12b p1=new Parent12b(); //Non parameterised constructor of Parent class is called
        System.out.println("---------------------------");

        Parent12b p2=new Parent12b(20);// parameterised constructor of Parent class is called
        System.out.println("---------------------------");

        Child12b c1=new Child12b();// Non parameterised constructor of Child class is called
        // so Non parameterised constructor of Parent class is executed
        System.out.println("---------------------------");

        Child12b c2=new Child12b(20); //  parameterised constructor of Child class is called
        // so Non parameterised constructor of Parent class is executed
        System.out.println("---------------------------");

        Child12b c3=new Child12b(10,20);
    }
}
