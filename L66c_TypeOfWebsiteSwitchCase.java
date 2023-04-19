package com.company;

import java.util.Scanner;

public class L66c_TypeOfWebsiteSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Domain name");
        String domain=sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        switch(ext) {
            case "com":
                System.out.println("Commercial");
                break;
            case "org":
                System.out.println("Organisation");
                break;
            case "gov":
                System.out.println("Government");
                break;
            case "net":
                System.out.println("Network");
                break;
        }
    }
}

//    google.com
//    abc.org
//   dfg.net
