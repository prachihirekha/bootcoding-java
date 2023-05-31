package com.bootcoding.practice.random;

import java.util.Random;

public class MultipleParameter {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            findPalindrome(random.nextInt(10000), random.nextInt(1000), random.nextInt(99));
        }
    }
    public static void findPalindrome(int a, int b,int c){
    findPalindrome(a);
    findPalindrome(b);
    findPalindrome(c);


    }
    public static void findPalindrome(int x){
        int org =x;
        int res =0;
        while(x !=0){
             res =res*10+ x %10;
            x =x/10;
        }
        if(res == org){
            System.out.println( org +" it is a palindrome");
        }
        else{
            System.out.println(org +"it is not a palindrome");
        }
    }
}
