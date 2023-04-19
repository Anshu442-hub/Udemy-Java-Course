package com.company;

public class Section6h_Quantifiers {
    public static void main(String[] args) {
//        // "*" 0 or more time
//        String str1 ="abcdef";
//        System.out.println(str1.matches(".*")); //anything is allowed for any no of times
//        String str2 ="abc def";
//        System.out.println(str2.matches(".*"));
//        String str8 ="abc56^ef";
//        System.out.println(str8.matches(".*"));
//        String str3 ="abcdef";
//        System.out.println(str3.matches("[a-z]*"));//any thing between specified range for any no of times
//        String str4 ="abc6def";
//        System.out.println(str4.matches("[a-z]*"));
//        String str5 ="aBcdef";
//        System.out.println(str5.matches("[a-z]*"));
//        String str6 ="abcbbcbbaaabc";
//        System.out.println(str6.matches("[abc]*"));//any character among the specified for any no of times(0 or more)
//        String str7 =" ";
//        System.out.println(str7.matches("[abc]*"));

//        //"+" one or more time
//        String str1="abcbbcbaaabc";
//        System.out.println(str1.matches("[abc]+"));//any character among specified any ono of times (1 or more time)
//        String str2=" ";
//        System.out.println(str2.matches("[abc]+"));
//        String str3="234ghy&* ";
//        System.out.println(str3.matches("[a-z 0-9 &* ]+"));
//        String str4="acc";
//        System.out.println(str4.matches("[abc]{3}")); //any character among specified character any no of time such that total 3 characters
//        String str5="ac";
//        System.out.println(str5.matches("[abc]{3}"));
//        String str6="accb";
//        System.out.println(str6.matches("[abc]{3}"));
//        String str7="accb";
//        System.out.println(str7.matches("[abc]{3,7}"));//any character among specified character min 3 and max 7 characters
//        String str8="accbaaa";
//        System.out.println(str8.matches("[abc]{3,7}"));
//        String str9="accbaaab";
//        System.out.println(str9.matches("[abc]{3,7}"));

        String str1="john@gmail.com";
        System.out.println(str1.matches(".*gmail.*"));//anything any no of times before and after gmail
        System.out.println(str1.matches("\\w*@gmail.*"));
        String str2="john-@gmail.com";
        System.out.println(str2.matches(".*gmail.*"));//anything any no of times before and after gmail
        System.out.println(str2.matches("\\w*@gmail.*"));
    }

}
