package com.bootcoding.practice.old;

import java.util.Scanner;
public class Grade1{
public static void getGrade1(double[]precentages){
for(int i=0; i < precentages.length; i++){
	checkGrad(precentages[i]);
}
}
public static void checkGrad(double precentages){
	if (precentages>=75){
	System.out.println(precentages + " A Grade " );
	}
	else if (precentages>=60){
	System.out.println(precentages + " B Grade");
	}
	else if (precentages>=50){
	System.out.println(precentages + " C Grade");
	}
    else if (precentages>=45){
		System.out.println(precentages + " D Grade");
		
	}
	else if (precentages<=45){
		System.out.println(precentages + " You are Fail ");
		}
}
public static void main(String[] agrs){
Scanner scanner =new Scanner(System.in);
double[] numbers = new double[5];
for(int i = 1; i<=5; i++){
System.out.println("Enter number " + i);
numbers[i-1] = scanner.nextDouble();
   
   }
   Grade1.getGrade1(numbers);
}
}
