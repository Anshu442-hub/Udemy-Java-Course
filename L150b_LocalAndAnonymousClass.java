package com.company;
class Outer150b {
    public void outerDisplay() { //outer class method
        //We can define a class inside a method also
        class Inner150b { //inner class
            public void innerDisplay() {
                System.out.println("Inner Display method");
            }
        }
        //Without any reference object is created ----this is called anonymous object
        new Inner150b().innerDisplay();

    }
}
public class L150b_LocalAndAnonymousClass {
    public static void main(String[] args) {
        Outer150b o = new Outer150b();
        o.outerDisplay();
    }
}
