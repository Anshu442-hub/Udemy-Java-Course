package com.company;

public class Section8c_ForLoop {
    public static void main(String[] args) {
//        //for loop
//        for (int i = 1; i <=10; i++) {
//            System.out.println(i);
//        }

        //for loop
//        for (int i = 10; i >0; i--) {
//            System.out.println(i);
//        }

//        //initialization is optional
//        int i = 1;
//        for (; i <=10; i++) {
//            System.out.println(i);
//        }

//        //we can write anything in initialization
//        int i = 1;
//        for (System.out.println("we can write anything in initialization"); i <=10; i++) {
//            System.out.println(i);
//        }

//       //updation is optional
//        for (int i = 1; i <=10; ) {
//            System.out.println(i);
//            i++;
//        }

//       // condition is optional
//        for (int i = 1; ; i++) { //infinite loop
//            System.out.println(i);
//        }

//        //all the three sections of for loop is optional
//        for (;   ; ) { //infinite loop
//            System.out.println("infinite loop");
//        }

//        //all the three sections of for loop is optional
//        for (;  true ; ) { //infinite loop
//            System.out.println("infinite loop");
//        }

        //We can declare multiple variables in for loop
        for (int i = 0,j=1; i <= 10; i++,j*=2) {
            System.out.println("i :"+i+" :: j :"+j);
        }
    }
}
