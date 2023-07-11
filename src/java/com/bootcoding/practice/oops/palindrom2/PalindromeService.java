package com.bootcoding.practice.oops.palindrom2;

public class PalindromeService {
    public int getPalindrome(int num){
        int rem =0;
        int org =num;
        int res =0;
        while (num>0){
            rem =num%10;
            res  =res*10+rem;
            num =num/10;
            if(res ==org){
             return 1;
            }

        }
        return 0;

    }
    public int[] multiplePalindrome(int []arr){
       int res[]= new int[arr.length];
        for(int i =0;i<arr.length;i++){
          res[i] =getPalindrome(arr[i]);
        }
        return res;
    }
}
