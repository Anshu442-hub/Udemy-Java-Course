package com.company;

public class L97b_OverloadReverseMethod {
    public static void main(String[] args) {
        int n=1234567;
        int a[]={5,3,1,7,9};
        System.out.println("Reversing number : "+reverse(n));
        System.out.print("Reversing array : ");
        reverse(a);
    }
    static int reverse(int n){
        int rev=0;
        while(n>0) {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    static void reverse(int a[]) {
        int b[]=new int[a.length];

        for(int i=a.length-1,j=0;i>=0;i--,j++) {
            b[j] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

    }

}
