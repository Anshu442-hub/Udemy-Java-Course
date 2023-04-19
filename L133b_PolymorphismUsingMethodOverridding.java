package com.company;
class Super133b {
    public void display() {
        System.out.println("Super display");
    }
}

class Sub133b extends Super133b {
    public void display() {
        System.err.println("Sub Display");
    }
}
public class L133b_PolymorphismUsingMethodOverridding {
    public static void main(String[] args) {
//        Super133b s1 =new Super133b();
//        s1.display();

        Super133b s2 =new Sub133b();
        s2.display();

    }
}
//NAme is same but different methids are called :: polymorphism