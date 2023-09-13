package com.bootcoding.practice.oops.palindrome;

import com.bootcoding.practice.oops.print.PrintService;

public class PalindromeApp {
    public static void main(String[] args) {
        PalindromeService palindrome =new PalindromeService();
        System.out.println(palindrome.getPalindrome(121));
        int [] arr ={121,737,898,223,332};
        int res[] =palindrome.getMultipleNumbers(arr);
        PrintService ps =new PrintService();
        ps.print(res);
    }
}
