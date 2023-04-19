package com.company;
class Super132e {
    final void display() {
        System.out.println("Super dispaly");
    }
}

class Sub132e extends Super132e {
// display() method in sub class cannot override display() method in super class as it is final
//    public void display() {
//        System.err.println("Sub Dispaly");
//    }
}


public class L132e_DosAndDontsOfOverriding {
    public static void main(String[] args) {
        Super132e su =new Super132e();
        su.display();

        Sub132e sub =new Sub132e();
        sub.display();
    }
}
//Static and final methods cannot be overridden
