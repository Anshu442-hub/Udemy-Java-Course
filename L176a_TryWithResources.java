package com.company;

import java.io.FileInputStream; //to access the file
import java.util.Scanner;//to use Scanner class

public class L176a_TryWithResources {
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
            System.out.println(a/b);
            f.close(); //close class file
            sc.close(); //close scanner class
    }

    public static void main(String[] args) throws Exception {
        Divide();
        int d= sc.nextInt(); //cannot read from scanner coz we have closed file as well as scanner
        System.out.println(d);
    }
}
