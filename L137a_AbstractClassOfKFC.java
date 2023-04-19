package com.company;
abstract class KFC{ //abstract class
    public KFC(){
        System.out.println("Constructor of KFC");
    }
    public void makeItem(){
        System.out.println("KFC made item");
    } //concrete method
    abstract public void billing(); //abstarct method
    abstract public void offer(); //abstarct method
}

class MyKFC extends KFC{  //concrete class
    public MyKFC(){
        System.out.println("Constructor of MyKFC");
    }
    public void billing(){
        System.out.println("MyKFC billing done");
    } //concrete method
    public void offer(){
        System.out.println("MyKFC offer given");
    } //concrete method
    public void festiveOffer(){
        System.out.println("MyKFC festiveOffer given");
    } //concrete method

}
public class L137a_AbstractClassOfKFC {
    public static void main(String[] args) {
        KFC kfc=new MyKFC();
        kfc.makeItem();
        kfc.billing();
        kfc.offer();
    }

}
