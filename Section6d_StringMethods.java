package com.company;

import static java.lang.String.*;

public class Section6d_StringMethods {
    public static void main(String[] args) {
//        //String objects are immutable,they cannot be changed
//        String str ="Java";//str is pointing to "Java"
//        String str1=str.toLowerCase();//str1 points to "java"
//        System.out.println(str); //str and str1 are pointing to two different Strings
//        System.out.println(str1);

//        //String Methods
//        String str ="Java";//created in String pool
//        //int lenght()
//        int l=str.length();
//        System.out.println(l);

//        //String toLowerCase()
//        String str1=str.toLowerCase();
//        System.out.println(str1);

//        //String toUpperCase()
//        String str2=str.toUpperCase();
//        System.out.println(str2);

//        //String trim()
//        String str="   Welcome   ";
//        String str1 = str.trim();
//        System.out.println(str1);

//        //String substring(int begin)
//        String str="Welcome";
//        String sub=str.substring(3);
//        System.out.println(sub);

        //String substring(int begin,int end)
//        String str="Welcome";
//        String sub=str.substring(3,6); //takes end-1
//        System.out.println(sub);

        //String replace(char old ,char new)
//        String str="Welcome";
//        String re=str.replace('e','K');
//        System.out.println(re);

//        String str="www.abcd.org";
//        //boolean startsWith(String s)
//        boolean b1=str.startsWith("www");
//        System.out.println(b1);
//        //boolean endsWith(String s)
//        boolean b2=str.endsWith("org");
//        System.out.println(b2);
//        //char  charAt(int index)
//        char ch=str.charAt(6);
//        System.out.println(ch);
//        // int indexOf(String s)
//        int a= str.indexOf(".");
//        System.out.println(a);
//        int b= str.indexOf("ab");
//        System.out.println(b);
//        // int indexOf(String s,int fromIndex)
//        int c= str.indexOf(".",4);
//        System.out.println(c);
//        int d= str.indexOf("?");//-1 if not present
//        System.out.println(d);
//        //int  lastIndexOf(String s) //starts from end
//        int e= str.lastIndexOf(".");
//        System.out.println(e);
//        //int  lastIndexOf(String s,int fromIndex) //starts from end
//        int f= str.lastIndexOf(".",7);
//        System.out.println(f);

//        String str1="JAVA";
//        String str2="java";//str1 and str2 refer to different object
//        String str3="python";
//        String str4="python";//str3 and str4 refer to same object
//        //boolean  equals(String s)
//        boolean p =str3.equals(str4);
//        System.out.println(p);
//        boolean q =str1.equals(str2);
//        System.out.println(q);
//        //boolean  equalsIgnoreCase(String s)
//        boolean r =str1.equalsIgnoreCase(str2);
//        System.out.println(r);
//        //int compareTo(String s)
//        int s =str2.compareTo(str3);
//        System.out.println(s);//negative integer when str2<str3
//        int t =str3.compareTo(str2);
//        System.out.println(t);//positive integer when str3>str2
//        int u =str1.compareTo(str2);
//        System.out.println(u);//upper case alphabet<lower case alphabet

//        //methods to convert any datatype to string
//        //all theses are overloaded methods
//        boolean b=true;
//        String str1=valueOf(b); //converts boolean to string
//        System.out.println(str1);
//        char c='l';
//        String str2=valueOf(c);//converts char to string
//        System.out.println(str2);
//        int i= 90;
//        String str3=valueOf(i);//converts int to string
//        System.out.println(str3);
//        float f=78.97f;
//        String str4=valueOf(f);//converts float to string
//        System.out.println(str4);
//        double d= 45.7896d;
//        String str5=valueOf(d);//converts double to string
//        System.out.println(str5);
//        long l=67L;
//        String str6=valueOf(l);//converts long to string
//        System.out.println(str6);

//        //boolean contains(String s)
//        String str="great wall of china";
//        boolean b1=str.contains("all");
//        boolean b2=str.contains("china");
//        System.out.println(b1);
//        System.out.println(b2);

        //String concat
        String atr1="the great wall";
        String atr2=" of china";
        String str3=atr1.concat(atr2);
        System.out.println(str3);
        String str4=atr1+atr2;
        System.out.println(str4);














    }
}
