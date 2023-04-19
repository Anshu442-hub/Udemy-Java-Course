package com.company;
//abstract final class  Super139a{
//    //abstract class cannot be declared as final
//    // because final class cannot be extended
//    // whereas abstract class is meant for inheritance
//}

//abstract static class  Super139a{
//    //abstract class cannot be declared as static
//}

//abstract  class  Super139a{
//    abstract static public void method1();
//    //abstract method cannot be declared as static
//}

//abstract  class  Super139a {
//    abstract final public void method1();
//    //abstract method cannot be declared as final
//    // because final method cannot be overriden
//    // whereas method are made abstract so that it can be overriden
//}

abstract  class  Super139a {
    abstract  public void method1();
    //if a class extends an abstract class it must override the abstract method to be able to become a concrete class
    //If not overriden the subclass also becomes abstract
}

class Sub139a extends Super139a{
      public void method1(){
          System.out.println("abstract method of abstract class Super139a is overriden  ");
      }

}
public class L139a_AbstractClassDosAndDont {
    public static void main(String[] args) {

    }
}
