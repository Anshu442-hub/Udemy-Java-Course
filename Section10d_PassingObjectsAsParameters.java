package com.company;

public class Section10d_PassingObjectsAsParameters {
    public static void main(String[] args) {
        int []a={2,3,4,5,6}; //object
        System.out.print("Original array : ");
        for (int e :a) {System.out.print(e+" ");}
        System.out.println();
        update(a); // object as actual parameter
        System.out.print("Modified array : ");
        for (int e :a) {System.out.print(e+" ");}


    }

    //if method is modifying an object then actual object will also be modified
    static void update(int []A){ //object as formal parameter
        A[0]=90;
    }
}
