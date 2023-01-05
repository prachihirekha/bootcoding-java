package com.bootcoding.practice.old;

public class PrintDigits
{
public static void main(String[] agrs)
{
	int z=123;
int first=0;
int last=z%10;



while(z!=0)
{
	first= z;
 z= z/10;

}
System.out.println("Print first ="+ first);
System.out.println("print last ="+last);
}
}