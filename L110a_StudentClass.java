package com.company;

public class L110a_StudentClass {
    public static void main(String[] args) {
        Student s=new Student();
        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;
        System.out.println("Details: \n"+ s );
        System.out.println("Total : "+s.total());
        System.out.println("Average : "+s.average());
        System.out.println("Grade : "+s.grade());

    }
    static  class Student{
        public int roll;
        public String name;
        public String course;
        public int m1,m2,m3;
        public int total() {
            return m1+m2+m3;
        }
        public float average() {
            return (float)total()/3;
        }
        public char grade() {
                return average()>=60 ?'A' : 'B';
        }

        public String toString() {
            return "Roll No : "+roll+"\n"+"Name : "+name+"\n"+"Course : "+course;
        }
    }
}
