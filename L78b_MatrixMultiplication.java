package com.company;

public class L78b_MatrixMultiplication {
    public static void main(String[] args) {
        int [][]a={{3,5,9},{7,6,2},{4,3,5}};
        int [][]b={{1,0,0},{0,1,0},{0,0,1}};
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

        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                c[i][j]=0;
                for(int k=0;k<c.length;k++) {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
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
