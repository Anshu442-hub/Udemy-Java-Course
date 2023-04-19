package com.company;
class Outer152c{ //outer class
    int x=10; //non static member of outer class
    static int y=20; //static member of outer class
    static class Inner152c{ //static inner class
        public void show(){
//            System.out.println(x);//nonstatic members cannot be accessed by static inner class
            System.out.println(y);//static members can be accessed by static inner class
        }
    }
}
public class L152c_LocalAndStaticInnerClass {
    public static void main(String[] args) {
//        Outer152c o=new Outer152c();
//        System.out.println(o.x);
//        System.out.println(o.y);

//        Outer152c.Inner152c oi=new Outer152c. Inner152c();
//        oi.show();
//
        //We can create object of static inner class without creating object of  outer class
        Outer152c.Inner152c ii=new Outer152c. Inner152c();
        ii.show();



    }
}
