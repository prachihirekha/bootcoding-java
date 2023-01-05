package com.bootcoding.practice.old;

public class EvenArray
{
public static void main( String [] agrs)
{
int[] nums= {10,25,20,21,29};
for (int i=0; i<nums.length;i++){
if (nums [i]%2==0){
System.out.println(nums[i]  );
}
else if(nums[i]%2!=0){
	System.out.println("\n Odd Number \n ");
	System.out.println(nums[i]);
}
}
}
}