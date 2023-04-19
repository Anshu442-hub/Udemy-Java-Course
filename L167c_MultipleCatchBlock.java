package com.company;

public class L167c_MultipleCatchBlock {
    public static void main(String[] args) {
        int A[]={10,0,8,3,5};
        try {
            int c=A[0]/A[1]; //ArithmeticException
            System.out.println("Division is : "+c);
            System.out.println(A[6]); //arrayIndexOutOfBound Exception
        }
        catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is Invalid : "+e);
        }
        catch(ArithmeticException e) {
            System.out.println("Denominator should not be 0 : " + e);
        }
        System.out.println("Bye");
    }
}
//For one try block there can be more than one catch block
//Inside a try block there can be more than one exception
//and to handle them we need more than one catch block
