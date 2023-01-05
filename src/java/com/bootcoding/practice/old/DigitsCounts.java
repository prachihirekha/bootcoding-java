package com.bootcoding.practice.old;

public class DigitsCounts
{
public static void main(String [] agrs)
{
int n= 1234;
int c = 0;
while(n!=0)
{
 int div = n/10;
 c++;
 n = div;

}
System.out.println(" count digits is" + c);
}
} 