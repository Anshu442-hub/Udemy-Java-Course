package com.company;
class Super127a {
    //This is not overriden method
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub127a extends Super127a {
    //This is not overriden method
    public void display(int x) { //Method of super class redefined in sub class
        System.out.println("Sub Display "+x);
    }
}
public class L127a_NotMethodOverriding {
    public static void main(String[] args) {
        Super127a su =new Super127a();
        su.display();

        Sub127a sub =new Sub127a();
        sub.display();
        sub.display(7);
    }
}
