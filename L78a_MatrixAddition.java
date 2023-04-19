package com.company;

public class L78a_MatrixAddition {
    public static void main(String[] args) {
        int [][]a={{3,5,9},{7,6,2},{4,3,5}};
        int [][]b={{1,5,2},{6,8,4},{3,9,7}};
        int [][]c=new int[3][3];

        System.out.println("A : ");
        for (int []x : a) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("B : ");
        for (int []x : b) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j]= a[i][j]+ b[i][j];
            }
        }
        System.out.println("C : ");
        for (int []x : c) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }

    }
}
