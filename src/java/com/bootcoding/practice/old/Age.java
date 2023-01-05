package com.bootcoding.practice.old;

public class Age
{
public static void main(String[]args)
{
int age =100;
int tem = 100;
//check -Even - divide by 2 or odd- subtract by 1 ubtil age becomes 0
int steps = 0;
for (int i = 0; age>0; i++)
{
if (age%2 ==0)
{
//Even number
age = age/2;
}
else
{
//odd number
age  = age - 1;

steps++;
}
}
}
}