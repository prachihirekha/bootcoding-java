package com.bootcoding.practice.oops.objectAsObjectParameter.mark;

public class Grade {
    public double  findPercentage(Mark p){
        System.out.println("Total Mark"+p.getTotalMark());
        System.out.println("Obtained Marks"+p.getObtainedMark());
        System.out.println("Percentage"+p.getPercentage());
        p.percentage=(p.getObtainedMark()/ p.getTotalMark())*100;
        System.out.println(p.percentage);
        return  p.percentage;
    }

    public void findGrade(double findPercentage){

        if(findPercentage>=85 && findPercentage<=75){
            System.out.println("A");
        }
        if(findPercentage<75 && findPercentage>=60){
            System.out.println("B");
        }
        if(findPercentage>40 && findPercentage<50){
            System.out.println("C");
        }
        if(findPercentage<=45 &&findPercentage>50){
            System.out.println("D");
        }
    }

}
