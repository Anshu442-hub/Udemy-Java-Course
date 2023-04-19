package com.company;
//Abstract class hence its object cannot be created
abstract class Super13a {
    public Super13a() { System.out.println("Super Constructor"); } //Constructor
    public void meth1() {System.out.println("Meth1 of Super");} //Concrete method
    abstract public void meth2(); //abstract method
}

//Concrete class as it overides all the
// abstract method of its super class
// hence its object can be created
class Sub13a extends Super13a {
    public Sub13a() { System.out.println("Sub Constructor"); } //Constructor

    @Override
    public void meth2() {
        System.out.println("Meth2 of Sub");
    }
    public void meth3() {
        System.out.println("Meth3 of Sub");
    }
}
public class Section13a_AbstractClass {
    public static void main(String[] args) {
        Super13a s1; //Refeerence of abstract class can be created
//        s1=new Super13a(); //Object  of abstract class cannot be created


        Sub13a s2=new Sub13a();// Refeerence and object  of concrete class can be created
        s2.meth1();
        s2.meth2();
        s2.meth3();

        //Reference is of super class and object of sub class
        Super13a s3=new Sub13a();
        s3.meth1();
        s3.meth2();
//        s3.meth3(); //cannot be called
    }
}
