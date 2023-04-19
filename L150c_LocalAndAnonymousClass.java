package com.company;
abstract class My150c{ //abstract class
    abstract void display(); //abstract method
}
class Outer150c{ //outer class
    public void meth(){ //method of outer class
        //m is the reference of abstract class
        //We cannot create object of abstract class
        //Inside the {} we are defining class My150c and overriding the abstract method display()
        My150c m= new My150c() {@Override void display() {System.out.println("Hello");}};
        m.display();
    }

}
public class L150c_LocalAndAnonymousClass {
    public static void main(String[] args) {
        My150c m ;
        Outer150c o =new  Outer150c();
        o.meth();
    }
}
//We are creating the object of abstract class by overriding the method
//Hence my class becomes concrete class --- This is called anonymous class