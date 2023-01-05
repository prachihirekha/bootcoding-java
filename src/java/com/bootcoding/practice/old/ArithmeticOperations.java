package com.bootcoding.practice.old;

public class ArithmeticOperations
{
public static void main(String[] agrs)
{
modulo(); 
} 
private static void modulo()
{
int result;
int rem = 10;
System.out.println("modulo (remainder)");
result = rem % 5;
System.out.println("Inital value: " + rem);
result = rem % 2;
System.out.println("rem =" + result);
System.out.println();
}
 
}