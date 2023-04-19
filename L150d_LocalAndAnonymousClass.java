package com.company;
interface My150d{ //interface
    void display(); //abstract method
}
class Outer150d{

    //This is not creating an object of interface but defining an anonymous class
    public void meth(){
        //overriding the display method
        My150d m =new My150d() {@Override public void display() {System.out.println("Hello");}};
        m.display();
    }
}
public class L150d_LocalAndAnonymousClass {
    public static void main(String[] args) {
        Outer150d o =new Outer150d();
        o.meth();
    }
}

//We are defining some anonymous class which is implementing that interface
