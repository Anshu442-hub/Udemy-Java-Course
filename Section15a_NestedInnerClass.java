package com.company;
class Outer15a {//Outer class
    int x=10; //Outer class member1 : variable
    class Inner15a { //Outer class member2 : inner class
        int y=20;  //Inner class variable
        public void innerDisplay() { //Inner class method
            System.out.println("Value of x : "+x); //inner class can directly access the members of outer class
            System.out.println("Value of y : "+y);
//            outerDisplay();//inner class can directly access the members of outer class
        }
    }
    public void outerDisplay() { //Outer class member3 :method
        //We can  create an object of Inner class inside outer class
        Inner15a i=new Inner15a();
        i.innerDisplay();
        //Outer class cannot directly access the members of inner class
        //it has to create object of inner class to access its members
//        System.out.println(y);
        System.out.println("Value of y : "+i.y);
    }
}
public class Section15a_NestedInnerClass {
    public static void main(String[] args) {
        Outer15a o=new Outer15a();//Reference of outer class and object of outer class
        System.out.println("Value of x : "+o.x);//accessing the members of outer class
        o.outerDisplay(); ///accessing the members of outer class
//        o.innerDisplay(); //outer class object cannot access the members of inner class
//        System.out.println(o.y); //outer class object cannot access the members of inner class
//
//        //We cannot directly refer the inner class
//        // unless we have given the name of outer class
        Outer15a.Inner15a oi=new Outer15a().new Inner15a();
        System.out.println("Value of y : "+oi.y); //accessing the members of inner class
        oi.innerDisplay(); //accessing the members of inner class
//        oi.outerDisplay(); //inner class object cannot access the member of outer class
    }
}
