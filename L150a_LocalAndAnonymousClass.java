package com.company;
class Outer150a {
    public void outerDisplay() { //outer class method
        //We can define a class inside a method also
        class Inner150a { //inner class
            public void innerDisplay() {
                System.out.println("Inner Display method");
            }
        }
        //Object of inner class is created inside method
        Inner150a i=new Inner150a();
        i.innerDisplay();

    }
}
public class L150a_LocalAndAnonymousClass {
    public static void main(String[] args) {
        Outer150a o = new Outer150a();
        o.outerDisplay();


    }
}
