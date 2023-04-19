package com.company;
class Rectangle124a{
    public int length;
    public int breadth;
    public Rectangle124a() {  //Non Parameterised constructor
       length= breadth =1 ;
    }
    public Rectangle124a(int length, int breadth) { //Parameterised constructor
        this.length = length;
        this.breadth = breadth;
    }
}
class Cuboid124a extends Rectangle124a{
    public int height;
    public Cuboid124a(){ //Non Parameterised constructor
        height=1;
    }
    public Cuboid124a(int height){ //Parameterised constructor
        this.height=height;
    }
    public Cuboid124a(int length,int breadth ,int height){ //Parameterised constructor
        super(length,breadth);
        this.height=height;
    }
    public int volume(){
        return length*breadth*height;
    }
}
public class L124a_RectangleAndCuboidInheritance {
    public static void main(String[] args) {
        Rectangle124a r1= new Rectangle124a();
        System.out.println("Length : "+r1.length);
        System.out.println("Breadth : "+r1.breadth);
        System.out.println("----------------------------------");
        Rectangle124a r2= new Rectangle124a(10,20);
        System.out.println("Length : "+r2.length);
        System.out.println("Breadth : "+r2.breadth);
        System.out.println("----------------------------------");
        Cuboid124a c1= new Cuboid124a();
        System.out.println("Length : "+c1.length);
        System.out.println("Breadth : "+c1.breadth);
        System.out.println("Height : "+c1.height);
        System.out.println("Volume : "+c1.volume());
        System.out.println("----------------------------------");
        Cuboid124a c2= new Cuboid124a(12);
        System.out.println("Length : "+c2.length);
        System.out.println("Breadth : "+c2.breadth);
        System.out.println("Height : "+c2.height);
        System.out.println("Volume : "+c2.volume());
        System.out.println("----------------------------------");
        Cuboid124a c3= new Cuboid124a(8,2,3);
        System.out.println("Length : "+c3.length);
        System.out.println("Breadth : "+c3.breadth);
        System.out.println("Height : "+c3.height);
        System.out.println("Volume : "+c3.volume());


    }
}
