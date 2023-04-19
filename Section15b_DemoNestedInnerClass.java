package com.company;
class Outer15b {
    int x=10;
    //Object of inner class can be created directly inside the outer class
    //Inner class object is accessible to whole outer class
    //Creating an inner class object and defining an inner class can be done in any order
    Inner15b i=new Inner15b();
    class Inner15b {
        int y=20;
        public void innerDisplay() {
            System.out.println("Value of x : "+x);
            System.out.println("Value of y : "+y);
        }
    }
    public void outerDisplay() {
        i.innerDisplay();
        //Outer class cannot directly access the members of inner class
        System.out.println("Value of y : "+i.y);
    }
}
public class Section15b_DemoNestedInnerClass {
    public static void main(String[] args) {

//        Outer15b o =new Outer15b();
//        System.out.println(o.x);
//        o.outerDisplay();

        Outer15b.Inner15b oi =new Outer15b().new Inner15b();
        System.out.println(oi.y);
        oi.innerDisplay();
    }
}
