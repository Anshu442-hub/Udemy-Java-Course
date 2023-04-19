package com.company;
class Subject {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    //Constructors
    public Subject(String subID,String name,int maxMarks,int marksObtains) {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtains=marksObtains;
    }

    //Getter and setter method
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    public void setMaxMarks(int maxMarks) {
        this.maxMarks=maxMarks;
    }
    public void setMarksObtain(int marksObtains) {
        this.marksObtains=marksObtains;
    }


    boolean isQualified() {
        return marksObtains>=maxMarks/10*4;
    }
    public String toString() {
        return "Subject ID : "+subID+"\nName : "+name+"\nMax marks : "+maxMarks+"\nMarks Obtained : "+marksObtains+"\nQalified : "+isQualified()+"\n------------------";
    }
}
public class L118a_ArrayOfObjectsClass {
    public static void main(String[] args) {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100,98);
        subs[1]=new Subject("s102","Algorithms",100,58);
        subs[2]=new Subject("s103","Operating Systems",100,30);

        for(Subject s:subs) {
            System.out.println(s);
        }
    }
}
