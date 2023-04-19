package com.company;
interface Test146c { //interfaces
    int X=10;
    void meth1();//abstract method
    void meth2();//abstract method
    //We are allowed to write private method
    // in an interface but that cannot be abstract
    private void meth3(){
        System.out.println("Meth3 of Test");
    }//private method
    default void meth4()
    {
        meth3();
    }//default method
}
public class L146c_InterfaceDosAndDont {
    public static void main(String[] args) {

    }
}

