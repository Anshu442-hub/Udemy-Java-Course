package com.company;

public class L174b_FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        finally {
            System.out.println("Final message");
        }

    }
}
