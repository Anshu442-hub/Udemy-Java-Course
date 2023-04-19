package com.company;
class HondaCity{ //class
    static double price =10; //static member
    int quantity=90; //non static member
    static double OnRoadPrice(String city){  //static method
        switch (city){
            case "Delhi" : return price + price * 0.1;
            case "Mumbai" : return price + price * 0.9;
        }
        //Static methods can access only static members of the class
        System.out.println(price);
        //Static methods cannot  access non static members of the class
//        System.out.println(quantity);
        return price;
    }
}
public class L153a_StaticVariables {
    public static void main(String[] args) {
        HondaCity h1=new HondaCity();
        System.out.println(h1.quantity); // accessing non static variable using object name
        System.out.println(h1.price); // accessing static variable using object
        System.out.println(h1.OnRoadPrice("Delhi")); // accessing static method using object
        System.out.println(h1.OnRoadPrice("Mumbai")); // accessing static method using object
        System.out.println(h1.OnRoadPrice("Patna")); // accessing static method using object

        HondaCity h2=new HondaCity();
        System.out.println(h2.quantity); // accessing non static variable using object name
        System.out.println(h2.price);
        System.out.println(h2.OnRoadPrice("Delhi")); // accessing static method using object
        System.out.println(h2.OnRoadPrice("Mumbai")); // accessing static method using object
        System.out.println(h2.OnRoadPrice("Patna")); // accessing static method using object

//        //Static members are shared by all the objects of class
        System.out.println(h1.price);
        System.out.println(h2.price);
        h1.price=20;
        System.out.println(h1.price); // accessing static variable using object name
        System.out.println(h2.price);

        //Non Static members are related to that object only
        System.out.println(h1.quantity); // accessing static variable using object name
        System.out.println(h2.quantity);
        h1.quantity=100;
        System.out.println(h1.quantity); // accessing static variable using object name
        System.out.println(h2.quantity);
//
        //Static members can be accessed by just using class name
        //without creating objects and by using class name also
        System.out.println(HondaCity.price);
        System.out.println(HondaCity.price=200);
        System.out.println(HondaCity.price);
//        System.out.println(HondaCity.quantity);
//
        //Static members can be accessed by just using class name
        //without creating objects and by using class name also
        System.out.println(HondaCity.OnRoadPrice("Delhi"));
        System.out.println(HondaCity.OnRoadPrice("Mumbai"));
        System.out.println(HondaCity.OnRoadPrice("Patna"));
  }
}
