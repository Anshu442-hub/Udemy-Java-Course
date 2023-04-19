package com.company;
class NegativeDimensionException extends Exception{
    public  String toString(){
        return "Negative Dimension";
    }
}
public class L172c_ThrowUserDefinedException {
    static int area(int a,int b) throws Exception{
        if(a<0|| b<0)
            throw new NegativeDimensionException();
        return a*b;
    }

    public static void main(String[] args) {
        try{
            System.out.println(area(-10,6));
        }
        catch (Exception e){
            System.out.println("Message : "+ e);
        }
    }

}
