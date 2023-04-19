package com.company;
class Test156b{
    //This static block is not executed bcoz when ever
    //the class Test156b is loaded these static blocks
    //will automatically get executed
    //But since we are not using the class test
    //static blocks did not get executed
    static {System.out.println("Static block1");}
}
public class L156b_StaticBlocks {
    static {System.out.println("Static block2");}
    public static void main(String[] args) {System.out.println("Main");}
    static {System.out.println("Static block3");}
}
