package com.company;

import java.io.FileInputStream;
import java.util.Scanner;

public class L176c_TryWithFinally {
    static FileInputStream f;//reference of FileInputStream class
    static Scanner sc;//reference of scanner class
    static void Divide() throws Exception {//method to read and divide data from a file
        f=new FileInputStream("C:\\Users\\anshu\\OneDrive\\Desktop\\Resource.txt");
        try {
            sc = new Scanner(f);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a / c); //exception arises
        }
        finally {
            f.close(); //always executed
            System.out.println("File closes");
            sc.close(); //always executed
            System.out.println("Scanner closes");

        }

    }
    public static void main(String[] args) throws Exception {
        try {
            Divide();
        }
        catch (Exception e){
            System.out.println("Message : "+e);
        }
        int d= sc.nextInt(); //since Scanner class gets closed so this gives an exception
        System.out.println(d);
    }
}
