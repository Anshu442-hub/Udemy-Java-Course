package com.company;

public class L155a_StaticBlocks {
    //Static blocks are executed once the
    // class is loaded before creation of any object of class
    static {System.out.println("Static block1");} //static block
    static {System.out.println("Static block2");} //static block
    public static void main(String[] args) {} //main method
    //Nothing inside main method but still block1 block2 block3
    //are printed bcoz once we run the program the class
    //will get loaded and once the class gets loaded
    //it will execute the static blocks in order
    static {System.out.println("Static block3");} //static block
    //There can be more than one static block in a class
    //Main is executed after executing all the static blocks

}
