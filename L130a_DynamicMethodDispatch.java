package com.company;
class Super130a {
    public void meth1() {
        System.out.println("Super Meth1");
    }
    public void meth2() {
        System.out.println("Super Meth2");
    }
}

class Sub130a extends Super130a {
    @Override
    public void meth2() {
        System.err.println("Sub Meth2");
    }
    public void meth3() {
        System.out.println("Sub Meth3");
    }
}

public class L130a_DynamicMethodDispatch {
    public static void main(String[] args) {
        Super130a s=new Sub130a(); //Refernce of Super class
        // and Object of sun class
        s.meth1();//meth1() of super is called
        s.meth2(); //meth2() of sub is called
//        s.meth3(); //Cannot be called

        //Using super class reference we can hold an object
        // of sub class and not vice versa but we can access
        // only those methods which are in super class
        // and cannot access the methods which are newly
        // defined in the sub class

    }
}
