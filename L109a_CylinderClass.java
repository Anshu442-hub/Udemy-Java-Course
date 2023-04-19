package com.company;

public class L109a_CylinderClass {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.radius=7;
        c.height=10;
        System.out.println("Height : "+c.height);
        System.out.println("Radius : "+c.radius);
        System.out.println("LidArea : "+c.lidArea());
        System.out.println("Circumference : "+c.perimeter());
        System.out.println("Total Surface Area : "+c.totalSurfaceArea());
        System.out.println("Volume : "+c.volume());

    }
    static class Cylinder{
        public double radius;
        public double height;
        public double lidArea() {
            return Math.PI*radius*radius;
        }
        public double perimeter() {
            return 2*Math.PI*radius;
        }
        public double totalSurfaceArea() {
            return 2*lidArea()+perimeter()*height;
        }
        public double volume() {
            return lidArea()*height;
        }
    }
}
