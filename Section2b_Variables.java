package com.company;

public class Section2b_Variables {
    public static void main(String[] args) {
        //variable declaration
        byte b;
        int i;
        char c;

//        //Using a variable without initialising it
//        System.out.println(b); //variable might not have been initialised
//        System.out.println(i); //variable might not have been initialised
//        System.out.println(c); //variable might not have been initialised

        //variable initialisation
        b=5;
        i=90;
        c='A';
//
//        Using variable after initialisation
        System.out.println(b);
        System.out.println(i);
        System.out.println(c);

//        //Using incompitable data type
//        b=900; //Incompatible type :posible lossy conversion
//        i="anshu";  //Incompatible type :posible lossy conversion
//        c=30.0; //Incompatible type :posible lossy conversion

        //Rules for variable names
//        int x;
//        float x; //Two different datatype variables cannot have same name

        int amount;
        float Amount;
        double amounT; //These are all different variables name

        int room1;
        int room_no;
        int room$num;

        float sum;
//        float 1sum; //should not start with a number
        float sum1;
        float $sum;

//        //Cannot be reserved word
//        boolean new;
//        int int;
//        int float;
//        char this;

        //variable name can be CLass name but it is not a good practice
        int String=89;
        float Integer =90.09f;
        boolean Character =true;

        System.out.println(String);
        System.out.println(Integer);
        System.out.println(Character);
    }



}
