package com.bootcoding.practice.old;

public class PrintAdds
{
public static void main(String[] agrs)
{
	int z=123;
int first=0;
int last=z%10;



while(z!=0)
{
	first= z;
 z= z/10;

}
//System.out.println("Print first ="+ first);
//System.out.println("print last ="+last);
int sum= first+last;
 System.out.println("Print sum=" +sum);
}
}