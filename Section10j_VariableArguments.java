package com.company;

public class Section10j_VariableArguments {
    public static void main(String[] args) {
        //variable arguments is used to
        // write one method that should work for any no of parameters
        show(); //no parameter
        show(10); //1 parameter
        show(10,20); //2 parameter
        show(10,20,30); //3 parameter
        show(10,20,30,40,50,60); //6 parameter

//        display(); //wont work
        display(10); //work
        display(10,20); //work
        display(10,20,30); //work
        display(10,20,30,40,50,60); //work

//        print(); //wont work
//        print("anu"); //wont work
        print("anu","raj"); //work
        print("anu","raj","shweta"); //work
        print("anu","raj","shweta","ria","tia","kia"); //work

    }
    static  void show(int ...x){ //variable arguments
//        //accessing the elements of variable
//        // argument using for loop
//        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i]+" ");
//        }
//        System.out.println();

//        //accessing the elements of variable
//        // argument using for each loop
//        for (int e : x) {
//            System.out.print(e+" ");
//        }
//        System.out.println();
    }

    //first argument (x) is compulsary and rest are variable arguments(...y)
    static void display(int x,int ...y){
//        for (int i = 0; i < y.length; i++) {
//            System.out.print(y[i]+" ");
//        }
//        System.out.println();
    }

    static  void print(String a,String b,String ...s){
//        for (int i = 0; i < s.length; i++) {
//            System.out.print(s[i]+" ");
//        }
//        System.out.println();

//        for (int i = 1; i < s.length; i++) {
//            System.out.print(s[i]+" ");
//        }
//        System.out.println();
//
//        for (int i = 2; i < s.length; i++) {
//            System.out.print(s[i]+" ");
//        }
//        System.out.println();
//
        System.out.println(a  +" "+b);
    }
}
