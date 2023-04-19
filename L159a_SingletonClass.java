package com.company;
class CoffeeMachine {
    //Singleton class --- more than one object of a class is not allowed
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    //private reference my is made static because it
    //is going to be accessed by a getInstance method
    //which is static
    static private CoffeeMachine my=null;
    private CoffeeMachine() { //constructor : private hence object of this class cannot be created
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    public void fillWater(float qty) {waterQty=qty;} //method
    public void fillSugar(float qty) {sugarQty=qty;} //method
    public float getCoffee() {return 0.15f;} //method

    //This method will create an instance of coffee machine
    static public CoffeeMachine getInstance() {
        if(my==null) my=new CoffeeMachine(); //object is created
        return my;
    }



}
public class L159a_SingletonClass {
    public static void main(String[] args) {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
    }
}
