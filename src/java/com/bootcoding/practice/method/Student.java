package com.bootcoding.practice.method;

import java.util.Random;

public class Student {
    String name;
    int rollnumber;
    int physicsMarks;
    int chemistryMark;
    int mathsMarks;
    double avgMarks;
    double percentage;
    char grade ;
    public void calculateAverage(){
        int sum =physicsMarks+chemistryMark+mathsMarks;
        avgMarks = sum / 3.00;
    }
public void print() {
    System.out.println(name);
    System.out.println(rollnumber);
    System.out.println(physicsMarks);
    System.out.println(chemistryMark);
    System.out.println(mathsMarks);
    System.out.println(avgMarks);
    System.out.println(percentage);
    System.out.println(grade);

}
public void calculatePercentage() {
    int sum =physicsMarks+chemistryMark+mathsMarks;

    percentage = (sum / 300.00) * 100;
}
public void calculateGrade()
{
if (percentage>=75)
{
    grade ='A';
}
else if (percentage>=60){
    grade = 'B';
}
else if (percentage>=45){
    grade ='C';

}
//return grade;
}

    public static void main(String[] args) {
        Random random = new Random();
    for(int i = 1; i<=50; i++){
        Student s1=new Student();
        s1.name ="Raja";
        s1.rollnumber =45;
        s1.chemistryMark= 10 + random.nextInt(90);
        s1.physicsMarks=  10 + random.nextInt(90);
        s1.mathsMarks = 10 + random.nextInt(90);

        s1.calculatePercentage();
        s1.calculateAverage();
        s1.calculateGrade();
        s1.print();

    }

}
}
//and 2 methods as calculateAverage() and calculatePercentage()