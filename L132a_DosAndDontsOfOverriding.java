package com.company;
class Super132a {
    public void display() {
        System.out.println("Super dispaly");
    }
    public void print(int x) {
        System.out.println("Super print "+ x);
    }
}

class Sub132a extends Super132a {
    @Override
    public void display() {
        System.err.println("Sub dispaly");
    }
    public void print() {
        System.err.println("Sub print");
    }
}
public class L132a_DosAndDontsOfOverriding {
    public static void main(String[] args) {
//        Super132a su =new Super132a();
//        su.display();
//        su.print(34);

        Sub132a sub =new Sub132a();
        sub.display();
        sub.print();
        sub.print(4);
    }
}

//Signatire of overidden method should be same :::
//here      public void display() { System.out.println("Super dispaly");}
//and       public void display() { System.err.println("Sub dispaly");}
//are overridden methods

//here         public void print(int x) {System.out.println("Super print "+ x);}
//and          public void print() {System.err.println("Sub print"); }
//are overloaded  methods and not overridden mothod