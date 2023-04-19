package com.company;

import java.io.FileInputStream;
import java.util.Scanner;

public class L176b_TryWithResources {
    static FileInputStream f;//reference of FileInputStream class
    static Scanner sc;//reference of scanner class

    static void Divide() throws Exception {//method to read and divide data from a file
        f=new FileInputStream("C:\\Users\\anshu\\OneDrive\\Desktop\\Resource.txt");
        sc=new Scanner(f) ;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a/c); //exception arises and thrown to calling method
        f.close(); //not executed
        sc.close(); //not executed
        //file and scanner class does not get closed
    }
    public static void main(String[] args) throws Exception {
        try {
            Divide();
        }
        catch (Exception e){
            System.out.println("Message : "+e);
        }
        int d= sc.nextInt(); //since scanner class is not closed we are able to read the data
        System.out.println(d);
    }
}
