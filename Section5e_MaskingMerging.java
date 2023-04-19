package com.company;

public class Section5e_MaskingMerging {
    public static void main(String[] args) {

//        //Merging = process of setting one of the bit as 1
        //make 4 th bit from right to 1
//        byte a=0;      //a= 0000 0000  //given no
//        byte b=8;      //b= 0000 1000   // take b such that the 4 th bit from right is 1 and rest all 0
//        a=(byte) (a|b);//a= 0000 1000 //merging
//        System.out.println(a); //8

//        //make 7 th bit from right to 1
//        byte a=8;        //a=0000 1000 //given no
//        byte b=64;       //b=0100 0000 // take b such that the 7 th bit from right is 1 and rest all 0
//        a=(byte) (a|b);  //a=0100 1000 //merging
//        System.out.println(a); //72

        //Masking = to hiding all the bits
        //to check whether 4 th bit from right is 0 or 1
//        byte a= 72;      //a=0100 1000  //given no
//        byte b=8;        //b=0000 1000  //take b such that the 4th bit from right is 1 and rest all 0
//        a=(byte) (a&b);  //a=0000 1000 //masking
//        if(a>0) System.out.println("4 th bit from right is 1");
//        else System.out.println("4 th bit from right is 0 ");
//        System.out.println(a); //8

//        //to check whether 5 th bit from right is 0 or 1
//        byte a= 72;      //a=0100 1000  //given no
//        byte b=16;       //b=0001 0000  //take b such that the 5th bit from right is 1 and rest all 0
//        a=(byte) (a&b);  //a=0000 1000 //masking
//        if(a>0) System.out.println("5 th bit from right is 1");
//        else System.out.println("5 th bit from right is 0 ");
//        System.out.println(a); //0

//        //To store nos from 0 to 10 and retrieve them
//        //store 5 and 9 in a single bit
//        byte b=5;        // b=0000 0101  //given no
//        byte c=9;        // c=0000 1001  //given no
//        byte a=0;        // a=0000 0000
//        a=(byte) (a|b);  // a=0000 0101 // 5
//        c=(byte) (c<<4); // c=1001 0000
//        a=(byte) (a|c);  // a=1001 0101 //9 5  //two nos stored in a single byte
//        System.out.println((a&0b11110000)>>4); //9  //retrieving 1 st no
//        System.out.println(a&0b00001111); //5        //retrieving 2 nd no

//        //store 6 and 7 in a single bit and retrieve them
//        byte b=6;        // b=0000 0110  //given no
//        byte c=7;        // c=0000 0111  //given no
//        byte a=0;        // a=0000 0000
//        a=(byte) (a|b);  // a=0000 0110 // 6
//        c=(byte) (c<<4); // c=0111 0000
//        a=(byte) (a|c);  // a=0111 0110 //7 6  //two nos stored in a single byte
//        System.out.println((a&0b11110000)>>4); //7  //retrieving 1 st no
//        System.out.println(a&0b00001111); //6        //retrieving 2 nd no

//        //store 9 and 12 in a single bit and retrieve them
        byte b=9;        // b=0000 1001  //given no
        byte c=12;       // c=0000 1100  //given no
        byte a=0;        // a=0000 0000
        a=(byte) (a|b);  // a=0000 1001 // 9
        c=(byte) (c<<4); // c=1100 0000
        a=(byte) (a|c);  // a=1100 1001 //12 9  //two nos stored in a single byte
        System.out.println((a&0b11110000)>>4); //12  //retrieving 1 st no
        System.out.println(a&0b00001111); //9        //retrieving 2 nd no





    }
}
