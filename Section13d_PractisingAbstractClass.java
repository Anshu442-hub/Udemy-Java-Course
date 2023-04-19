package com.company;
 abstract class Super13d {
    public Super13d() { System.out.println("Super Constructor"); } //Constructor
    public void meth1() {System.out.println("Meth1 of Super");} //Concrete method
    abstract public void meth2(); //abstract method
}
public class Section13d_PractisingAbstractClass {
    public static void main(String[] args) {
        Super13d s; //We can declare reference of abstract class
//        s=new Super13d(); //but cannot create object of abstract class
    }
}

//Concrete class cannot have abstract method so declare super as abstract