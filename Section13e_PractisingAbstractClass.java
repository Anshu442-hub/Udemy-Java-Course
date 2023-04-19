package com.company;
abstract class Super13e {
    public Super13e() { System.out.println("Super Constructor"); } //Constructor
    public void meth1() {System.out.println("Meth1 of Super");} //Concrete method
    abstract public void meth2(); //abstract method
}

class Sub13e extends Super13e { //concrete class
    public Sub13e() { System.out.println("Sub Constructor"); } //Constructor

    @Override
    public void meth2() {
        System.out.println("Meth2 of Sub");
    }//method
    public void meth3() {
        System.out.println("Meth3 of Sub");
    }
}
public class Section13e_PractisingAbstractClass {
    public static void main(String[] args) {
        Super13e s; //reference of abstract class
//        s=new Super13e(); //object of abstract class cannot be created

        Sub13e sub =new Sub13e();  //reference and object of concrete class
        sub.meth1();
        sub.meth2();
        sub.meth3();

        //reference of abstract class and object of concrete class
        s=new Sub13e();
        s.meth1();
        s.meth2();

    }
}
