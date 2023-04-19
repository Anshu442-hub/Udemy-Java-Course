package com.company;

import java.util.Scanner;

public class L97c_OverloadValidateMethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=sc.nextLine();
        System.out.print("Enter age : ");
        int age=sc.nextInt();

        if(validate(name))
            System.out.println("Valid name");
        else
            System.out.println("Invalid name");

        if(validate(age))
            System.out.println("Valid age");
        else
            System.out.println("Invalid age");
    }
    static boolean validate(String name){
        return name.matches("[a-z A-Z \\s]+");
    }
    static boolean validate(int age){
        return age>=3 && age<=15;
    }
}
