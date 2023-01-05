package com.bootcoding.practice.old;

import java.util.Scanner;
public class Discount{
	
public static void getdiscount(int[] numbers){ 

for(int i=0; i < numbers.length; i++){
	getdiscount(numbers[i]);
}
}
public static void getdiscount(int number){
	if (number>=8){
	System.out.println(number + " is eligible for 50% discount");
	}
	else if (number>=5){
	System.out.println(number + " is eligible for 25% discount");
	}
	else if (number>=1){
	System.out.println(number + " is eligible for 10% discount");
	}
	else if (number>=0){
		System.out.println(number + " is not eligible for discount");
	}
}
public static void main(String[] agrs){
Scanner scanner =new Scanner(System.in);
int[] numbers = new int[5];
for(int i = 1; i<=5; i++){
System.out.println("Enter number " + i);
numbers[i-1] = scanner.nextInt();
}
getdiscount(numbers);

}
}