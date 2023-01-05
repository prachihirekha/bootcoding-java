package com.bootcoding.practice.old;

public class Method
{
//method definitio 1time only
public static void printNaturalNumber(int num)
{
for ( int i = 1; i<=num; i++)
{
System.out.println(i);
}
}
public static void printEvenNumber(int even)
{
	for (int i = 1; i<=even;i++)
	{
		if ( i%2==0)
		{
			System.out.println(i);
		}
	}
}
	
public static void main(String[] agrs)
{
printNaturalNumber (5);// Method calling with argumnet value
printNaturalNumber (10);// Method calling with argumnet value
printEvenNumber(20);
}
}


