package com.bootcoding.practice.oops.palindrom2;

public class PalindromeApp {
    public static void main(String[] args) {
        PalindromeService palindrome =new PalindromeService();
        palindrome.getPalindrome(121);
        int[] arr ={121,134,767};
        int res[]=palindrome.multiplePalindrome(arr);
        PrintMethod printMethod =new PrintMethod();
        printMethod.printArray(res);
       // printMethod.printArray(r);
    }
}
