package com.company;
class Rectangle125a {
    int length;
    int breadth;
    public Rectangle125a(int l, int b) {
        length=l;
        breadth=b;
    }
    public void display(){
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
    }
}
public class L125a_ThisKeyword {
    public static void main(String[] args) {
        Rectangle125a r1=new Rectangle125a(10,5);
        r1.display();

        Rectangle125a r2=new Rectangle125a(20,10);
        r2.display();

    }
}
