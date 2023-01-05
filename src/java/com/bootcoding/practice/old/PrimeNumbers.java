package com.bootcoding.practice.old;

public class PrimeNumbers
{
	public static void main(String[] ags)
	{
		int x =100;
		boolean isPrime = true;
		for(int i=2; i<x; i++)
		{
			if(x%i == 0){
			
				System.out.println(x + " is not prime");
				isPrime = false;				
				break;
			}
			
		}
		if(isPrime){
			System.out.println(x + " is prime");
		}
	}
}