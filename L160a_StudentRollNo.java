package com.company;
import java.util.Date;
class Student {
    private String rollNo;
    private static int count=1;
    private String assignRollNo() { //method
        Date d=new Date();
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student() {rollNo=assignRollNo();} //constructor
    public String getRollNo() {return rollNo;}
}
public class L160a_StudentRollNo {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }
}
