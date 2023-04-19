package com.company;
class Super132c {
    public void display() {
        System.out.println("Super dispaly");
    }
}

class Sub132c extends Super132c {
    public void display() {
        System.err.println("Sub Dispaly");
    }
}
public class L132c_DosAndDontsOfOverriding {
    public static void main(String[] args) {
        Super132c su =new Super132c();
        su.display();

        Sub132c sub =new Sub132c();
        sub.display();
    }
}
//Return type should be same
// here   public void display() {System.out.println("Super dispaly");}
//and    public int display() { System.err.println("Sub Dispaly");return 0; }
//are not overriden method
