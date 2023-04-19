package com.company;
class Rectangle125c {
    int length;
    int breadth;
    int x=100;

    Rectangle125c(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    void display() {
        System.out.println("Rectangle length : "+length);
        System.out.println("Rectangle breadth : "+breadth);
        System.out.println("x : "+x);
    }


}
class Cuboid125c extends Rectangle125c {
    int height;
    int x=200;
    Cuboid125c(int l, int b, int h) {
        super(l,b);
        height=h;
    }
    void display() {
        System.out.println("Cuboid length : "+length);
        System.out.println("Cuboid breadth : "+breadth);
        System.out.println("Cuboid height : "+height);
        System.out.println("x : "+x);
        System.out.println("x : "+super.x);
    }
}
public class L125c_SuperKeyword {
    public static void main(String[] args) {
        Rectangle125c r=new Rectangle125c(10,5);
        Cuboid125c c=new Cuboid125c(11,25,15);
        r.display();
        c.display();
    }
}
