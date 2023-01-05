package com.bootcoding.practice.old;

public class Palindrom
{
	public static void main( String [] agrs)
	{
		int rem = 0;
		int n =239 ;
		int temp =n;
			while(n!=0)
			{
				int div = n/10;
				rem = rem* 10+ n%10;
				n = div;
			}
			if (rem==temp)
				
			{
				System.out.println("palindrom");
				
			}
			else
			{
				System.out.println("is not palindrom");
				
			}
	}
}
  //iteration
 //itr 1 =239, div = 23, rem=9,
 //n=23
//itr 2 = n=23, div=2, rem=3
//n=2
//itr 2 n= 2, div = 0, rem= 2
//n=0
//itr false.
 