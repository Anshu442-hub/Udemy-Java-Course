package com.company;

public class L172a_PropagationOfException {
    public static void main(String[] args) {
        meth1();//calls meth1
    }
    static void meth1(){
        meth2(10,0);//calls meth2
    }
    static int meth2(int a ,int b){
        return a/b; //exception raised here and not handled by try and catch
    }
}
//exception if not handled will be propagated
// to its calling method and program crashes
