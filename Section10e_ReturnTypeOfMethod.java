package com.company;

public class Section10e_ReturnTypeOfMethod {
    public static void main(String[] args) {
        String email="vijay@gmail.com";
        String userName= extractUserName(email);
        System.out.println(userName);

        int x=10,y=20;
        int c=max(x,y);
        System.out.println(c);

        int []array={2,3,4};
        System.out.print("Original Array : ");
        for (int e:array) {System.out.print(e+" ");}
        System.out.println();
        update(array);
    }
    static String extractUserName(String mail){ //return type is String
        int a=mail.indexOf('@');
        String name= mail.substring(0,a);
        return name;
    }

    static int max(int x,int y){ //return type is int
        return x>y?x:y;
    }

    static void update(int []arr){ //return type is void
        arr[0]=20;
        System.out.print("Updated Array : ");
        for (int e:arr) {System.out.print(e+" ");}
    }
}
