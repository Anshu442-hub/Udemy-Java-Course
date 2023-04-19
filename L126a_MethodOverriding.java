package com.company;
class Super126a {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub126a extends Super126b {
    public void display() { //Method of super class redefined in sub class
        System.out.println("Sub Display");
    }
}
// MethodOverriding is redefining a method of super class in sub class
public class L126a_MethodOverriding {
    public static void main(String[] args) {
        Super126a su =new Super126a();
        su.display(); //method of super class is called


        Sub126a sub =new Sub126a();
        sub.display(); //Overridden method of super class
        // can never be called upon an object of sub class
        // because overridden method from super class is
        // shadowed by method of sub class

    }
}
