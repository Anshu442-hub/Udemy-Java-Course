package com.company;
 class Test158a{
     //initialising final variables as a member of class
     //method1 : initialise during declaration
     final int A =10;

//     When we use final variables as a member of class
//     it must be declared and initialised simultaneously
//     final int B ;
//     B=20;

//     //Declaration and initialisation not allowed in separate statement
//     //if we use static block
//     final  float P ; //non static
//     static {P=123.45f;} //static

 //Declaration and initialisation is allowed in separate statement
//     //if we use static block and make declaration as static
     final static float Q ; //static
     static {Q=123.45f;} //static


     //Declaration and initialisation is allowed in separate statement
     //if we use  block
     final float Z ; //non static
     {Z=123.45f;} //non static
}
public class L158a_FinalKeyword {
    public static void main(String[] args) {
        //initialising final variables inside a method
        //method1 : initialise during declaration
        final int X =30;
        //method2 : initialise after declaration
        final int Y ;
        Y=40;
    }
}
