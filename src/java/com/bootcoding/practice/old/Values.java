package com.bootcoding.practice.old;

import java.util.Scanner;
public class Values {
public static void main(String[] agrs){
Scanner in = new  Scanner(System.in);
int res = 0;
int r = 0;
int s = 0;
int d = 0;
int k = 0;
System.out.println(" Enter Number" );
int a = in.nextInt();
System.out.println("You said: " + a);
System.out.println("Enter Number" );
int b = in.nextInt();
res = a + b;
r = (a + b) * (a + b);
s = a*a + b*b;
d = a*a +2*a*b + b*b;
k  = ((a*a)*(b*b))+ 2*a*b + ((a*a)-(b*b));
System.out.println("a + b= " + res);
System.out.println ("(a + b)2= " +r);
System. out.println("a2+ b2= " + s);
System. out.println("a2 +2ab + b2= " + d);
System. out.println("a2b2+ 2ab+ a2-b2= " + k);


}

}