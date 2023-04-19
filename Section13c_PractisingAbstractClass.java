package com.company;
  class Super13c {
    public Super13c() { System.out.println("Super Constructor"); } //Constructor
    public void meth1() {System.out.println("Meth1 of Super");} //Concrete method
//    abstract public void meth2(); //abstract method
}

public class Section13c_PractisingAbstractClass {
    public static void main(String[] args) {
        Super13c s; //We can declare reference of abstract class
//        s=new Super13d(); //but cannot create object of abstract class
    }
}

//If a class is having an abstract method
// then that class should be declared abstract