package com.company;
class Outer151a{
    static  int x=10; //static member of outer class
    int y=20; //non static member of outer class
    static class Inner151a{ //static inner class
        void display(){
            System.out.println(x); //static inner class can access only the static members of outer class
//            System.out.println(y);
        }
    }
}
public class L151a_StaticInnerClass {
    public static void main(String[] args) {
        Outer151a o =new Outer151a();
        System.out.println(o.x);
        System.out.println(o.y);
////        o.display();

        Outer151a.Inner151a oi =new Outer151a.Inner151a();
//        System.out.println(oi.x);
//        System.out.println(oi.y);
        oi.display();
    }
}
