package com.company;
class Super132b {
    public void display() {
        System.out.println("Super dispaly");
    }
}

class Sub132b extends Super132b {
    public void Display() {
        System.err.println("Sub Dispaly");
    }
}
public class L132b_DosAndDontsOfOverriding {
    public static void main(String[] args) {
//        Super132b su =new Super132b();
//        su.display();

        Sub132b sub =new Sub132b();
        sub.display();
        sub.Display();
    }
}
//For overriding name of the method should be same
