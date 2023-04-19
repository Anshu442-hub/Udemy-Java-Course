package com.company;

public class Section9b_2D_Arrays {
    public static void main(String[] args) {
        //Creating 2D arrays
//        //method1
//        int a[][]=new int[3][4]; //array object is created in heap
//        //method2
//        int [][]d= new  int[5][6];
//        //metho3
//        int []e[]=new  int[5][6];
//        //method4
//        int b[][]={{1,2,3,4},{2,4,6,8},{3,5,7,9}};
//        //method5
//        int c[][]; //declaration
//        c=new int[3][4]; //initialisatiotn

//        //Practising 2D array
//        int []a ,b[]; //a is 1D array and b is 2D array
//        a=new int[6];
////        a=new int[6][9]; //error : as a is 1D array
//        a=new int[6]; // a is 1D array
////        b=new int[6]; // error : b is 2D array
//        b=new int[6][7]; // b is 2D array
//        int []c,d,e,f; //c,d,e,f are 1D array
//        int []p,q,r,s[]; //p,q,r are 1D array and s is 2D array

//        //Accessing 2D array using  counter controlled for loop
//        int a[][]={{1,2,3,4},{2,4,6,8},{3,5,7,9}};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

////        //Accessing 2D array using for each  loop
//        int a[][]={{1,2,3,4},{2,4,6,8},{3,5,7,9}};
//        for (int x[] : a ) {
//            for (int y : x) {
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(a);
//        System.out.println(a.length);


//        //Creating a jagged array
        int a[][]=new int[3][];
        a[0]=new int[2];
        a[1]=new int[4];
        a[2]=new int[3];

//        //Accessing jadded array using  counter controlled for loop
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

//Accessing jadded array using  counter controlled for loop
        for (int x[] : a) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }






    }
}
