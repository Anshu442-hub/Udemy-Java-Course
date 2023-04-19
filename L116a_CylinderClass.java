package com.company;
class  Cylinder116a{
    private double radius;
    private double height;
    //Constructors
    public Cylinder116a() {
        radius=height=1;
    }
    public Cylinder116a(double r) {
        radius=r;
        height=1;
    }
    public Cylinder116a(double r,double h) {
        radius=r;
        height=h;
    }
    //Getter and setter method
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    public void setHeight(double h) {
        height = h > 0 ? h : 0;
    }
    public void setRadius(double r) {
        radius = r > 0 ? r : 0;
    }

    public void setDimensions(double h,double r) {
        height=h;
        radius=r;
    }
    public double lidArea() {
        return Math.PI*radius*radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double drumArea() {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume() {
        return lidArea()*height;
    }

}
public class L116a_CylinderClass {
    public static void main(String[] args) {
        Cylinder116a c1=new Cylinder116a();
        Cylinder116a c2=new Cylinder116a(2.0,3.0);
        Cylinder116a c3=new Cylinder116a(6.0);

        System.out.println("Height : "+c1.getHeight());
        System.out.println("Radius : "+c1.getRadius());
        System.out.println("LidArea : "+c1.lidArea());
        System.out.println("Circumference : "+c1.perimeter());
        System.out.println("totalSurfaceArea : "+c1.drumArea());
        System.out.println("Volume : "+c1.volume());
        System.out.println("--------------------------------");
        System.out.println("Height : "+c2.getHeight());
        System.out.println("Radius : "+c2.getRadius());
        System.out.println("LidArea : "+c2.lidArea());
        System.out.println("Circumference : "+c2.perimeter());
        System.out.println("totalSurfaceArea : "+c2.drumArea());
        System.out.println("Volume : "+c2.volume());
        System.out.println("--------------------------------");
        System.out.println("Height : "+c3.getHeight());
        System.out.println("Radius : "+c3.getRadius());
        System.out.println("LidArea : "+c3.lidArea());
        System.out.println("Circumference : "+c3.perimeter());
        System.out.println("totalSurfaceArea : "+c3.drumArea());
        System.out.println("Volume : "+c3.volume());

    }

}
