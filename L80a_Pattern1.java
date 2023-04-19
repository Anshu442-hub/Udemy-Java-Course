package com.company;
//      * * * * *
//        * * * *
//          * * *
//            * *
//              *
public class L80a_Pattern1 {
    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <=5+1-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=5; j++) {
                if(i<=j) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
