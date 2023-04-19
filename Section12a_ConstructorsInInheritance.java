package com.company;
class Parent12a {
    public Parent12a() {
        System.out.println("Parent Constructor");
    }
}
class Child12a extends Parent12a {
    public Child12a() {
        System.out.println("Child Constructor");
    }
}
class GrandChild12a extends Child12a {
    public GrandChild12a() {
        System.out.println("Grand Child Constructor");
    }
}
public class Section12a_ConstructorsInInheritance {
    public static void main(String[] args) {
//        Constructors are methods of class which are
//        automatically called whenever an object is created
        Parent12a p=new Parent12a();
        System.out.println("------------------------------");
//        When we create an object of child class
//        the parent class constructor is executed first
//        since child class inherits from parent class
        Child12a c=new Child12a();
        System.out.println("------------------------------");
        GrandChild12a gc=new GrandChild12a();
    }
}

//    Whatever the level of inheritance is
//    when we create an object of some class then
//    the constructor of top most class in the level will be executed first
