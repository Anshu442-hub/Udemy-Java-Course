package com.company;
 class Test154a{
    static int x=10; //static member
    int y =20; //non static member
    void show(){//non static method
        //non static method can access both static and non static member
        System.out.println("show : "+x);
        System.out.println("show : "+y);
    }
    static void display(){ //static method
        //static method can access only static and not non static member
        System.out.println("display : "+x);
//        System.out.println(y);
    }
}
public class L154a_StaticVariables {
    public static void main(String[] args) {
        Test154a t1 =new Test154a();
//        System.out.println(t1.x);
//        System.out.println(t1.y);
//        t1.show();
//        t1.display();

        Test154a t2 =new Test154a();
//        System.out.println(t2.x);
//        System.out.println(t2.y);
//        t2.show();
//        t2.display();

        //        //Static members are shared by all the objects of class
        System.out.println(t1.x);
        System.out.println(t2.x);
        t1.x=100;
        System.out.println(t1.x);
        System.out.println(t2.x);

        //Non Static members are related to that object only
        System.out.println(t1.y);
        System.out.println(t2.y);
        t1.y=200;
        System.out.println(t1.y);
        System.out.println(t2.y);

//        t1.show();
//        t2.show();
//
//        t1.display();
//        t2.display();


        }
}
