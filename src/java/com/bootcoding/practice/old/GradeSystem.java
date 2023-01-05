package com.bootcoding.practice.old;

import java.util.Scanner;


public class GradeSystem{
public static char getGrade(double percentage){
if (percentage>=75){
return 'A';
}
if (percentage>=60){
return'B';
}
return 'C';
}
public static void main(String[] agrs){
Scanner scanner =new Scanner(System.in);
double n =scanner.nextDouble();
System.out.println(GradeSystem.getGrade(n));
}
}
//













