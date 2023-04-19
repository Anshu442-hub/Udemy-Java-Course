package com.company;

public class L170a_HierarchyOfExceptionMultipleCatchBlock {
    public static void main(String[] args) {
        int A[]={10,0,8,3,5};
        try {
            System.out.println("Division is : "+A[0]/A[1]); //ArithmeticException
        }
        catch(ArithmeticException e) { //will handle only  ArithmeticException
            System.out.println("Denominator should not be 0 : " + e);
        }
        catch(Exception e) { //will handle all Exception
            System.out.println("Exception : "+e);
        }

//        //super class will shadow subclass and is a syntax error
//        catch(Exception e) {  //will handle all Exception
//            System.out.println("Exception : "+e);
//        }
//        catch(ArithmeticException e) { //second catch block is shadowed
//            System.out.println("Denominator should not be 0 : " + e);
//        }



        System.out.println("Bye");
    }
}
//Whenever we write multiple catch blockss
//the upper catch block must be a subclass of lower catch block
//if there exist any hierarchy b/w catch blocks