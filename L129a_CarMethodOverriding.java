package com.company;
class Car129a {
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}
}
class LuxaryCar129a extends Car129a {
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof Opened");}
}
public class L129a_CarMethodOverriding {
    public static void main(String[] args) {
//        Car129a c1=new Car129a();
//        c1.start();
//        c1.accelerate();
//        c1.changeGear();

//        LuxaryCar129a lc1=new LuxaryCar129a();
//        lc1.start();
//        lc1.accelerate();
//        lc1.changeGear();
//        lc1.openRoof();

        Car129a car=new LuxaryCar129a();
        car.start(); //method of  car is called
        car.accelerate(); //method of  car is called
        car.changeGear(); //method of luxury car is called
//        car.openRoof();


    }
}
