package com.bootcoding.practice.old;

public class Calculator
{
public static int add(int a, int b)
{
int sum = a+b;
return sum;
}
public static double division (int a, int b){
	int div= a/b;
	return div;
}
public static int sub (int a, int b){
	int sub= a-b;
	return sub;
}
public static int mul (int a, int b){
	int mul= a*b;
	return mul;
}
public static void main(String[] agrs){
int res = add (10, 20);
System.out.println(res);

double result = division(5, 50);
System.out.println(result);
int f = sub(50, 30);
System.out.println(f);
int y = mul(12, 4);
System.out.println(y);

}
}