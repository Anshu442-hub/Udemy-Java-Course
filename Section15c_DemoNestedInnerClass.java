package com.company;
class Outer15c {
    int x=10;
    class Inner15c {
        int y=20;
        public void innerDisplay() {
            System.out.println("Inner Value of x : "+x);
            System.out.println("Inner Value of y : "+y);
        }
    }
    public void outerDisplay() {
        //Object of inner class can be created  inside method of the outer class
        //Inner class object is accessible to method outer class
        Inner15c i=new Inner15c();
        i.innerDisplay();
        //Outer class cannot directly access the members of inner class
        System.out.println("Outer Value of y : "+i.y);
    }
}
public class Section15c_DemoNestedInnerClass {
    public static void main(String[] args) {
        Outer15c o =new Outer15c();
        System.out.println(o.x);
        o.outerDisplay();

        Outer15c.Inner15c oi =new Outer15c().new Inner15c();
        System.out.println(oi.y);
        oi.innerDisplay();

    }
}
