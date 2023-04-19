package com.company;
class Super157b{ //super clsss
    final void meth1(){System.out.println("Hello");} //final method
}
class Sub157b extends Super157b{ //sub class
    //final method cannot be overridden
//    void meth1(){System.out.println("Hi");}
    void meth2(){System.out.println("Bye");}
}
public class L157b_FinalMethods {
    public static void main(String[] args) {
        Super157b s =new Super157b();
        s.meth1();

        Sub157b sub =new Sub157b();
        sub.meth2();
    }
}
