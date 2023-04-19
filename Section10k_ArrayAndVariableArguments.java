package com.company;

public class Section10k_ArrayAndVariableArguments {
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{3,5,7,9}); //variable argument supports array

//        display();  //array does not support variable argument
//        display(101,201,301);  //array does not support variable argument
        display(new int[]{2,4,6,8});
    }
    static void show(int ...A){ //variable argument as parameter
        for (int x:A) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void display(int A[]){ //array as parameter
        for (int e:A) {
            System.out.print(e+" ");
        }
        System.out.println();
    }
}
