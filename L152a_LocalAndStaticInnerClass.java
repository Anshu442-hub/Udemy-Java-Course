package com.company;
abstract class My152a{ //abstract class
    abstract void show(); //abstract method
}
class Outer152a{
    public void display(){
//        //m is the object of abstract class by making it as a concrete class ----anonymous classs
//        My152a m= new My152a() {@Override void show() {System.out.println("Helllo");}};
//        m.show();

        //OR object is created without reference i.e. anonymous object and anonymous class
        new My152a() {@Override void show() {System.out.println("Helllo");}}.show();
    }
}
public class L152a_LocalAndStaticInnerClass {
    public static void main(String[] args) {
        Outer152a o=new Outer152a();
        o.display();
    }
}
