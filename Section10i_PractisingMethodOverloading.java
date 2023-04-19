package com.company;

public class Section10i_PractisingMethodOverloading {
    public static void main(String[] args) {
        System.out.println( max(10,5));
    }

    //Two methods cannot have same signature
//    static int max(int x,int y){return x>y?x:y;}
//    static int max(int x,int y){return x>y?x:y;}
//    static int max(int a,int b){return a>b?a:b;}

    //We cannot have two methods with same name even if its return type is different
    // as return type of method is not considerd while compariong two methods
//        static int max(int x,int y){return x>y?x:y;}
//        static float max(int x,int y){return x>y?x:y;}

    //Same method works for float as well as int
//    // bcoz integer is compatible with float
        static int max(byte x,byte y){return x>y?x:y;}
        static float max(int x,int y){return x>y?x:y;}

}
