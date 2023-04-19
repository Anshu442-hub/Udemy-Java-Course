package com.company;
class Outer15d {
    static int x=10; //static member of outer class
    Inner15d i=new Inner15d();
    class Inner15d {
        int y=20;
        public void innerDisplay() {
            //Inner members can access static members of outer class
            System.out.println("Inner Value of x : "+x);
            System.out.println("Inner Value of y : "+y);
        }
    }
    public void outerDisplay() {
        //Object of inner class can be created  inside method of the outer class
        //Inner class object is accessible to method outer class
        i.innerDisplay();
        //Outer class cannot directly access the members of inner class
        System.out.println("Outer Value of y : "+i.y);
    }
}
public class Section15d_DemoNestedInnerClass {
    public static void main(String[] args) {
//        Outer15d o =new Outer15d();
//        System.out.println(o.x);
//        o.outerDisplay();

        Outer15d.Inner15d oi =new Outer15d().new Inner15d();
        System.out.println(oi.y);
        oi.innerDisplay();
    }
}
