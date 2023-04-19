package com.company;

public class Section8b_InfiniteLoop {
    public static void main(String[] args) {
//        //infinite while loop
//        int i=1;
//        while (true){
//            System.out.println(i);
//            i++;
//        }

//        //infinite while loop
//        byte b=1;
//        while (true){
//            System.out.println(b);
//            b++;
//        }

        //java does not allow unreachable statement
        int i=1;
        while (true) {
            System.out.println(i);
            i++;
        }
//        System.out.println("This statement is never executed and hence is unreachable");
    }
}
