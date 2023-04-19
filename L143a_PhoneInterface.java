package com.company;
class Phone { //concrete class
    public void call() { System.out.println("Phone call"); } //concrete method
    public void sms() { System.out.println("Phone sending SMS"); } //concrete method
}
interface ICamera { //interface
    void click();
    void record();
}
interface IMusicPlayer {  //interface
    void play();
    void pause();
    void stop();
}
//A class can extend only one class but implement multiple interfaces
class SmartPhone extends Phone implements ICamera,IMusicPlayer {
    public void videoCall() { System.out.println("Smart Phone video calling"); } //own method
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void pause() { System.out.println("Smart Phone pausing music"); }
    public void stop() { System.out.println("Smart Phone stopped  music"); }

}
public class L143a_PhoneInterface {
    public static void main(String[] args) {
        Phone p1 =new Phone();//Reference of  concrete class and object of  concrete class
        p1.call();
        p1.sms();

        SmartPhone sp1 =new SmartPhone();//Reference of  concrete class and object of  concrete class
        sp1.videoCall();
        sp1.click();
        sp1.record();
        sp1.play();
        sp1.pause();
        sp1.stop();

        Phone p2 =new SmartPhone();//Reference of  Super class and object of  sub class
        p2.call();
        p2.sms();

        Phone p3 = new SmartPhone();//Reference of  Super class and object of  sub class
        p3.sms();
        p3.call();

        ICamera c =  new SmartPhone();//Reference of interface and object of  concrete class
        c.click();
        c.record();

        IMusicPlayer m =  new SmartPhone();//Reference of  interface and object of  concrete class
        m.pause();
        m.play();
        m.stop();



    }
}
