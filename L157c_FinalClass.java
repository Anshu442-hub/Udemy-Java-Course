package com.company;
final  class Super157c{ //final class
     void meth1(){System.out.println("Hello");} //final method
}
//Final class cannpt be extended
//class Sub157c extends Super157c{
//
//}
public class L157c_FinalClass {
    public static void main(String[] args) {
        //We can create object of final class but cannot extend it
        Super157c s= new Super157c();
        s.meth1();
    }
}
