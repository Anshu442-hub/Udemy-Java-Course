package com.company;

public class Section10c_ModificationDoneInParameters {
    public static void main(String[] args) {
        int a=10;
        increment1(a); //actual parameter
        System.out.println(a);

        System.out.println(increment2(a));  //actual parameter
        System.out.println(a);
    }

    //Modificatoion done in formal parameters will not affect the actual parameter
    static void increment1(int x){ //formal parameter
        x=x+20;
        System.out.println(x);
    }
    static int increment2(int y){  //formal parameter
        y=y+30;
        return y;
    }
}
