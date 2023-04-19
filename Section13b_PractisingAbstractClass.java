package com.company;
abstract class Super13b {//Abstract class with no abstract method
    public Super13b() { System.out.println("Super Constructor"); } //Constructor
    public void meth1() {System.out.println("Meth1 of Super");} //Concrete method
}

public class Section13b_PractisingAbstractClass {
    public static void main(String[] args) {
        Super13b s; //abstract class can have reference
//        s=new Super13b(); //object of abstract class cannot be created
    }
}

//An abstract class can have 0 or more abstract method
