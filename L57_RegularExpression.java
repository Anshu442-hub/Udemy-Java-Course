package com.company;

public class L57_RegularExpression {
    public static void main(String[] args) {
        removeSpecialCharactersFromString();
        removeExtraSpacesFromString();
        findNoOfWords();
    }
    private static void removeSpecialCharactersFromString() {
        String s1="a!5ju*76%op)99";
        System.out.println(s1.replaceAll("[^a-z A-Z 0-9]",""));

        String s2="12345asdfg$%^& 90";
        System.out.println(s2.replaceAll("[^a-z A-Z 0-9]",""));
    }
    private static void removeExtraSpacesFromString() {
        String s1="   qwe   123   45  tyhh 7   ";
        String t1= s1.trim();
        System.out.println(t1.replaceAll("\\s+"," "));
    }

    private static void findNoOfWords() {
        String s1="   abc   def   fgh   ";
        String t1=s1.trim();
        System.out.println(t1);
        String r1=t1.replaceAll("\\s+"," ");
        System.out.println(r1);
        String words1[]=r1.split(" ");
        System.out.println(words1.length);

        String s2="abcdef fgh   ";
        String t2=s2.trim();
        System.out.println(t2);
        String r2=t2.replaceAll("\\s+"," ");
        System.out.println(r2);
        String words2[]=r2.split(" ");
        System.out.println(words2.length);

    }
}
