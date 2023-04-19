package com.company;

import java.util.HashSet;

abstract class Hospital{ //abstract class
    public Hospital(){
        System.out.println("Constructor of Hospital");
    }
    abstract public void emergency(); //abstarct method
    abstract public void appointment(); //abstarct method
    abstract public void billing(); //abstarct method
    abstract public void admit(); //abstarct method
}

class MyHospital extends Hospital{  //concrete class
    public MyHospital(){
        System.out.println("Constructor of MY Hospital");
    }
     public void emergency(){
         System.out.println("MyHospital emergency created");
     } //concrete method
     public void appointment(){
         System.out.println("MyHospital appointment done");
     } //concrete method
     public void billing(){
         System.out.println("MyHospital billing done");
     } //concrete method
     public void admit(){
         System.out.println("MyHospital admission done ");
     }//concrete method

}

public class L136a_AbstractClassOfHospital {
    public static void main(String[] args) {
        Hospital h; //Reference of Abstract class can be created
//        h = new Hospital();  //Object of Abstract class cannot be created

        h=new MyHospital();//object of concrete class
        h.emergency();
        h.appointment();
        h.billing();
        h.admit();


    }
}
