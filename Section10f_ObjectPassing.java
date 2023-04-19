package com.company;

public class Section10f_ObjectPassing {
    public static void main(String[] args) {
        //For an object as parameter,
        // a change in formal parameter will also modify the actual parameter
        int a[]={2,4,6,8,10}; //object
        System.out.print("Original Array : ");
        for (int e:a) {System.out.print(e+" ");}
        System.out.println();
        changeArray(a,2,100); //actual parameter
        System.out.print("Updated Array : ");
        for (int e:a) {System.out.print(e+" ");}
        System.out.println();



        //For a primitive datatype as parameter,
        // a change in formal parameter will not affect the actual parameter
        int b=20; //primitive datatype
        System.out.println("Original value of b : "+b);
        changeInt(b,-80); //actual parameter
        System.out.println("Value of b : "+b);

    }

    private static void changeInt(int b, int value) { //formal parameter
        b=value;
    }

    private static void changeArray(int[] array, int index, int value) { //formal parameter
        array[index]= value;
    }
}
