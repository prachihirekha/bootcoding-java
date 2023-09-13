package com.bootcoding.practice.oops.palindrome;

public class PalindromeService {

        public boolean getPalindrome(int n)
        {
            int originalNum=n;
            int rem=0;
            int reverse=0;
            while(n>0)
            {
                rem=n%10;
                reverse= reverse*10+rem;
                n=n/10;
            }
            return reverse==originalNum;
        }
        public int[] getMultipleNumbers(int arr[])
        {
            int result[]= new int[arr.length];
            for (int i=0;i<arr.length;i++)
            {
                if(getPalindrome(arr[i])) {
                    result[i] = arr[i];
                }
            }
            return result;
        }
    }

