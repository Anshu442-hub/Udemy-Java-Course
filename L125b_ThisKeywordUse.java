package com.company;
class Rectangle125b {
    int length;
    int breadth;
    //If there is any name conflict b/t the parameter and the property
    // then to refer to the properties use this keyword
    //This keyword is the reference to the current object
    public Rectangle125b(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public void display(){
        System.out.println("Length : "+this.length);
        System.out.println("Breadth : "+this.breadth);
    }
}
public class L125b_ThisKeywordUse {
    public static void main(String[] args) {
    Rectangle125a r1=new Rectangle125a(1,5);
        r1.display();

    Rectangle125a r2=new Rectangle125a(20,1);
        r2.display();
    }
}