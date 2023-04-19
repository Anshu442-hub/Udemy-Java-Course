package com.company;
class Store145a { //concrete class Super class
    Member145a members[]=new Member145a[10];
    int count=0;
    public Store145a() {
        System.out.println("Store145a constructor");
    } //constructor

    void register(Member145a m) {
        System.out.println("Member registered");
        members[count++]=m;
    }
    void inviteSale() {
        System.out.println("Invitation sent");
        for(int i=0;i<count;i++) {
            members[i].callback();
        }
    }
}
interface Member145a {//interface
    void callback();//abstract method
}
class Customer145a implements Member145a { //class implementing interface
    String name;
    public Customer145a(String n) {
        System.out.println("Customer145a constructor");
        name=n;
    } //constructor
    public void callback() {
        System.out.println("Ok, I will visit,"+name);
    }//method

}
public class L145a_CallBackMethod {
    public static void main(String[] args) {
        Store145a s1=new Store145a();
//        s1.inviteSale();

        Customer145a c1=new Customer145a("John");
        c1.callback();
        s1.register(c1);
        s1.inviteSale();

        Customer145a c2=new Customer145a("Smith");
        c2.callback();
        s1.register(c2);
        s1.inviteSale();

    }
}
