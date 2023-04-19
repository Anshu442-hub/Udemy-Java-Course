package com.company;

public class L156a_StaticBlocks {
    static {System.out.println("Static block1");} //static block
    static {System.out.println("Static block2");} //static block
    public static void main(String[] args) {System.out.println("Main ");} //main method
    static {System.out.println("Static block3");} //static block
    //Main is executed after executing all the static blocks
}
