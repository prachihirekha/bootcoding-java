package com.bootcoding.practice.old;

public class Armstrong
{
public static void main (String [] agrs)
{
		int rem = 0;
		int sum = 0;
		int n =371;
		 int temp= n;
			while(n!=0)
			{
				int div = n/10;
				rem = n%10;
				sum = sum+( rem*rem*rem); 
				n = div;
			}
			if (sum == temp)
			{
				System.out.println("Armstrongs");
			}
			else
			{
				System.out.println("is not Armstrongs");
			}
	}
}
 
 
