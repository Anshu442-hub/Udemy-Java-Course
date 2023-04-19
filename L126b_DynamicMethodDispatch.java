package com.company;
class Super126b {
    public void display() {
        System.out.println("Super Display");
    }
}
class Sub126b extends Super126b {
    public void display() {
        System.out.println("Sub Display");
    }
}
public class L126b_DynamicMethodDispatch {
    public static void main(String[] args) {
        Super126b s=new Sub126b();//Reference of Super class and object of sub class
        s.display();
    }

    //Dynamic method dispatch - When a super class reference
    // holding an object of sub class
    // and overridden method is called
    // then the method of the object is called
    // and not the method of the refernce
}
