package com.bootcoding.practice.oops.objectAsObjectParameter.mark;

public class MarkApp {
    public static void main(String[] args) {
        Mark mark= new Mark();
        mark.setTotalMark(600);
        mark.setObtainedMark(453);
        Grade grade=new Grade();
       double r= grade.findPercentage(mark);
        grade.findGrade(r);
       double v= grade.findPercentage(mark);
          mark.setObtainedMark(300);
        mark.setTotalMark(600);
        grade.findGrade(v);
        double p= grade.findPercentage(mark);
        mark.setObtainedMark(500);
        mark.setTotalMark(600);
        grade.findGrade(p);
        double a= grade.findPercentage(mark);
        mark.setObtainedMark(250);
        mark.setTotalMark(600);
        grade.findGrade(a);
    }
}
