package com.company;
class Test{
    public  int max(int a,int b){ //2 parameter :methid overloading
        return a>b? a:b;
    }
    public  int max(int a,int b,int c){ //3 parameter :methid overloading
        return a>b && a>c ? a:(b>c) ?b :c;
    }
}
public class L133a_PolymorphismUsingMethodOverloading {
    public static void main(String[] args) {
        Test t1=new Test();
        System.out.println( t1.max(10,5));//calls 2 parameter
        System.out.println( t1.max(10,5,15)); //calls 3 parameter
        //NAme is same but actions are different : Polymorphism
    }
}
