package com.company;

public class Section10h_MethodOverloading {
    public static void main(String[] args) {
        //Method overloading - more than one method having
        // same name but different parameter list
        //ie either
        // i)datatype of parameter is different
        // ii ) no of parameter is different
        //Return type of method is not considerd while compariong two methods
        System.out.println(max(5,10)); //calls max(int a,int b) method
        System.out.println(max(5f,10f)); //calls  max(float a,float b) method
        System.out.println(max(5,10,15)); //calls max(int a,int b,int c) method


    }

    static int max(int a,int b){ //max of two integers
        return a>b?a:b;
    }
    static float max(float a,float b){ //max of two floats
        return a>b?a:b;
    }
    static int max(int a,int b,int c){ //max of three integers
        return a>b && a>c ? a : (b>c ? b : c);
    }
}
