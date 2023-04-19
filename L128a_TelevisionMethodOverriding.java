package com.company;
class TV128a {
    public void switchON(){ System.out.println("TV Switched ON"); }
    public void changeChannel() { System.out.println("TV Channel Changed "); }

}
class SmartTV128a extends TV128a{
    @Override
    public void switchON(){ System.out.println("Smart TV Switched ON"); }

    @Override
    public void changeChannel() { System.out.println("SmartTV Channel Changed "); }

    public void browse(){ System.out.println("Smart Tv Browsing"); }

}
public class L128a_TelevisionMethodOverriding {
    public static void main(String[] args) {
//        TV128a tv1=new TV128a();
//        tv1.switchON();
//        tv1.changeChannel();

//        SmartTV128a stv1=new SmartTV128a();
//        stv1.switchON();
//        stv1.changeChannel();
//        stv1.browse();

        //Using super class reference we can hold an object
        // of sub class and not vice versa but we can access
        // only those methods which are in super class
        // and cannot access the methods which are newly
        // defined in the sub class
        TV128a t2=new SmartTV128a();
        t2.switchON(); //method of smart tv is called
        t2.changeChannel(); //method of smart tv is called
        //this method is newly defined in the
        // sub class hence cannot be accessed
//        t2.browse();


        //Using super class reference we can hold an object
        // of sub class and not vice versa
//        SmartTV128a t3=new TV128a();

    }
}
