package com.bootcoding.practice.leetcode;

public class CountOfDigitAndDivided {
    public int countDigit(){
        int nums =121;
        int n =nums;
        int count =0;
        while(nums!=0){
            int r =nums%10;
            if(n%r==0){
                count++;
            }
            nums =nums/10;

        }
        return count;
    }

    public static void main(String[] args) {
        CountOfDigitAndDivided cv =new CountOfDigitAndDivided();
       int k = cv.countDigit();
        System.out.println(k);

    }
}
