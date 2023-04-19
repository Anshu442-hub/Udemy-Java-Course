package com.company;

//public class L172b_ThrowException {
//    public static void main(String[] args) {
//        meth1();//calls meth1
//    }
//    static void meth1(){
//        try {
//            System.out.println(meth2(-10, 8));
//        }
//        catch (Exception e){
//            System.out.println("Message : "+e);
//        }
//    }
//
//    //throw is used for throwing an exception
//    //throws is used for defining an exception
//    //When we are throwing from a method ,
//    //in the signature of the method we should
//    //declare that this method throws an exception
//    //so that the method which is calling must catch
//    //that exception
//    static int meth2(int a ,int b) throws Exception{
//        if(a<0|| b<0)
//            throw new Exception("Negative dimentions");
//        return a*b;
//    }
//}


//OR

public class L172b_ThrowException {
    public static void main(String[] args) {
        //if a method does not want to handle
        //an Exception it can throw it further
        //to its calling method
        try {
            meth1();
        }
        catch (Exception e){
            System.out.println("Message : "+e);
        }
    }
    static void meth1() throws Exception{
        System.out.println(meth2(-10, 8));
    }
    static int meth2(int a ,int b) throws Exception{
        if(a<0|| b<0)
            throw new Exception("Negative dimensions");
        return a*b;
    }
}
