package com.bootcoding.practice.random;

import java.util.Random;

public class MultipleSumOfIntegerNumberParameter {
    public static void main(String[] args) {
        Random random =new Random();
        for(int i =0;i<500;i++){
            findSumOfInteger(random.nextInt(153), random.nextInt(437), random.nextInt(229) );
        }
    }
    public static void findSumOfInteger (int a,int p,int c){
        findSumOfInteger(a);
        findSumOfInteger(p);
        findSumOfInteger(c);

    }
    public static void findSumOfInteger(int x){
        int sum=0;
        int v =x;
        while (x>0){
            int res =x%10;
            x=x/10;
            sum =sum+res;
        }
        System.out.println("  sum of integer  "+ v +" is" + sum);
    }

}
