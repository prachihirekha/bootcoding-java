package com.bootcoding.practice.old;

public class PrintNumbers
{
public static void main(String args [])
{
String num1 = args [0];
String num2 = args [1];
// convert string into integer
int x = Integer.parseInt (num1);
int y = Integer.parseInt (num2);
int res;
if(x%2 == 0 && y%2 == 0)
{
	 res =x+y;
System.out.print(x + "+" + y + "is " + res);
}
else 
{
	 res = x*y;
	System.out.print(x + "*" + y + " is " + res);
}
}
}