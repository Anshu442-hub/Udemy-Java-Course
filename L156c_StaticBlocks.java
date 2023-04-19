package com.company;
class Test156c{
    static {System.out.println("Static block1");}
}
public class L156c_StaticBlocks {
    public static void main(String[] args) {
        //Create an object of class ,then class will get loaded
        //and static blocks executed
//        Test156c t1 =new Test156c();
//        System.out.println("Main");

        System.out.println("Main");
        Test156c t2 =new Test156c();

    }
    static {System.out.println("Static block2");}

}
