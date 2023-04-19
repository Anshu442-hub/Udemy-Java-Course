package com.company;
//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15
public class L79b_Pattern2 {
    public static void main(String[] args) {
        int c=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%2d ",c++);
            }
            System.out.println();
        }
    }
}
