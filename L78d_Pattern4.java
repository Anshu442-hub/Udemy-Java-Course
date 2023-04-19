package com.company;
public class L78d_Pattern4 {
    public static void main(String[] args) {
        //  1 2 3 4 5
//          6 7 8 9 10
//          11 12 13 14 15
//          16 17 18 19 20
//          21 22 23 24 25
//        int c=1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j =1; j <= 5; j++) {
//                System.out.print(c+++" ");
//            }
//            System.out.println();
//        }

//          1  2  3  4  5
//          6  7  8  9  10
//          11 12 13 14 15
//          16 17 18 19 20
//          21 22 23 24 25
//        int c=1;
//        for (int i = 1; i <= 5; i++) {
//            for (int j =1; j <= 5; j++) {
//                System.out.printf("%2d ",c++);
//            }
//            System.out.println();
//        }

        //  01 02 03 04 05
//          06 07 08 09 10
//          11 12 13 14 15
//          16 17 18 19 20
//          21 22 23 24 25
        int c=1;
        for (int i = 1; i <= 5; i++) {
            for (int j =1; j <= 5; j++) {
                System.out.printf("%02d ",c++);
            }
            System.out.println();
        }

    }
}
