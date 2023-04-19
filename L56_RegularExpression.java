package com.company;

import static java.lang.String.valueOf;

public class L56_RegularExpression {
    public static void main(String[] args) {
        binaryOrNot();
        hexaDecimalOrNot();
        dateFormat();
    }
    private static void dateFormat() {
        String s1="01/02/2000";
        if(s1.matches("[0-3][ 0-9]/[01][0-9]/[0-9]{4}"))
            System.out.println("Date format is dd/mm/yyyy");
        else System.out.println("Date format is not dd/mm/yyyy");

        String s2="09/12/2090";
        if(s2.matches("[0-3][ 0-9]/[01][0-9]/[0-9]{4}"))
            System.out.println("Date format is dd/mm/yyyy");
        else System.out.println("Date format is not dd/mm/yyyy");
    }
    private static void hexaDecimalOrNot() {
        String s1="234AB";
        if(s1.matches("[0-9 A-F]+"))
            System.out.println("Hexadecimal");
        else System.out.println("Not Hexadecimal");

        String s2="2B34AZ";
        if(s2.matches("[0-9 A-F]+"))
            System.out.println("Hexadecimal");
        else System.out.println("Not Hexadecimal");
    }

    private static void binaryOrNot() {
        int b1=1010101101;
        String str1=valueOf(b1);
        if(str1.matches("[0 1]+"))
            System.out.println("No is binary");
        else System.out.println("No is not binary");

        int b2=1010191101;
        String str2=valueOf(b2);
        if(str2.matches("[0 1]+"))
            System.out.println("No is binary");
        else System.out.println("No is not binary");

    }
}
