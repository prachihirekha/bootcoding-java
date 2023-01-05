package com.bootcoding.practice.old;

public class ArithmeticOperations2
{
public static void main(String[] agrs)
{ 
preIncrement(); 
} 
private static void preIncrement()
{
int result;

System.out.println("pre INCREMENT BY ONE");
int preIncrement=5;
double d = 234.744;
double e = ++d;
System.out.println("e =" + e + " , d = " + d);
System.out.println("Initial value: " + preIncrement);
result = ++preIncrement;
System.out.println("result =" + result + ", preIncrement= " + preIncrement);
System.out.println("++preIncrement =" + preIncrement);
result = 10 + ++preIncrement;
System.out.println("reuslt (10 + ++preIncrement) =" + result);
System.out.println("++preIncrement) =" + preIncrement);
System.out.println();
} 
}