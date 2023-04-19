package com.company;
interface My152b{
    void show();
}
class Outer152b{
    public void display(){
 //m is the object of interface by making it as a concrete class ----anonymous classs
        My152b m=  new My152b(){public void show(){System.out.println("Hello");}};
       m.show();

        //OR object is created without reference i.e. anonymous object and anonymous class
        new My152b(){public void show(){System.out.println("Hello");}}.show();

    }
}
public class L152b_LocalAndStaticInnerClass {
    public static void main(String[] args) {
        Outer152b o=new Outer152b();
        o.display();
    }
}
