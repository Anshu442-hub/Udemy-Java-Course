package com.company;

public class L55_StringMethods {
    public static void main(String[] args) {
        String str ="programmer@gmail.com";
        if(str.matches(".*gmail.*"))
            System.out.println("Mail id is on gmail");
        else System.out.println("Mail id is not on gmail");
        int i=str.indexOf("@");
        String user=str.substring(0,i);
        System.out.println("User name : "+user);
        String domain=str.substring(i+1,str.length());
        System.out.println("Domain name : "+domain);

    }
}
