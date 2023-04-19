package com.company;

public class Section10l_VariableArguments {
    public static void main(String[] args) {
        showList("john","smith","ajay","ahmed");
        System.out.println("-------------------");
        showList(5,"john","smith","ajay","ahmed");
        System.out.println("-------------------");
//        showList("john","smith","ajay","ahmed",6);
    }

    static void showList(String ...s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(i+1+". " +s[i]);
        }
    }

    static void showList(int start,String ...s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(start+". " +s[i]);
            start++;
        }
    }

    //Varaiable argument parameter must be the last parameter
//    static void showList(String ...s,int start){
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(start+". " +s[i]);
//            start++;
//        }
//    }
}
