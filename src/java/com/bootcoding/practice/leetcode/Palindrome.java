package com.bootcoding.practice.leetcode;

public class Palindrome {
    public boolean isPalindrome(int x) {
        int rem = 0;
        int reverse = 0;
        int originalNum = x;
        while (x>0) {
            //121
            rem = x % 10;// 1
            reverse = reverse * 10 + rem;
            x = x / 10;
        }
        System.out.println(reverse);
            if (rem == originalNum) {
                return true;
            }

        return false;
    }

    public static void main(String[] args) {
        Palindrome obj= new Palindrome();
       obj.isPalindrome(-121);

    }
}
