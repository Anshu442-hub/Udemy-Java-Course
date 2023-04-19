package com.company;

public class L167d_NestedTryAndCatch {
    public static void main(String[] args) {
        try {
            int A[] = {10, 0, 8, 3, 5};
            try {
                System.out.println("Division is : " + A[0] / A[1]);
            } catch (ArithmeticException e) {
                System.out.println("Denominator should not be 0 : " + e);
            }
            System.out.println(A[6]); //arrayIndexOutOfBound Exception
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid : "+e);
        }
        System.out.println("Bye");
    }
}
