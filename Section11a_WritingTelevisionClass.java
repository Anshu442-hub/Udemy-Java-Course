package com.company;

public class Section11a_WritingTelevisionClass {
    public static void main(String[] args) {
        Television tv1=new Television(); //object tv1 is created in heap
        tv1.changeChannel(); // changeChannel() method call
        tv1.changeVolume(); // changeVolume() method call
    }

    static class Television{  //Television class
        public    int channel; //property
        public int volume; //property
        public void changeChannel(){  //method
            System.out.println("Channel changed");
        }

        public void changeVolume(){  //method
            System.out.println("Volume changed");
        }
    }
}
