package com.company;


public class Section10g_ParameterPassing {
    public static void main(String[] args) {

        //There is only one method of parameter passing in java ---
        // the contents of actual parametres are copied in formal parameters
        int a=10,b=5; //primitive datatype
        int c=add(a,b);// passing a  primitive datatype as parameter
        System.out.println(c);

        String name="Anshu"; //object
        welcome(name); //passing object as parameter
    }

    static int add(int x, int y){
        return x+y;
    }

    static void welcome(String name) {
        System.out.println("Welcome "+ name);
    }
}
