package com.company;

class A{}
class B extends  A{}
class Super132d {
    public A display() {
        System.out.println("Super dispaly");
        return new A();
    }
}
class Sub132d extends Super132d {
    public B display() {
        System.err.println("Sub Dispaly");
        return new B();
    }
}
public class L132d_DosAndDontsOfOverriding {
    public static void main(String[] args) {
        Super132d su =new Super132d();
        su.display();

        Sub132d sub =new Sub132d();
        sub.display();
    }
}
//Situation where return type of
// overridden method can be different
//This is allowed because A is super class and B is subclass
//So if a method is returning an object of claas A then
// the overridded method can return an object of subclass
// of A or same class A
