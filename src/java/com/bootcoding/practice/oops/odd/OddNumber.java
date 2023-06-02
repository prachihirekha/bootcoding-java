package com.bootcoding.practice.oops.odd;

public class OddNumber {
    public boolean isOdd(int num){
        if(num %2!=0){
            System.out.println(num);
            return true;
        }
        return false;
    }
    public boolean allOddNum(int [] nums){
        for(int i =0;i< nums.length;i++){
            if(nums[i] %2==0){
                System.out.println(nums[i]);
            return false;
            }
        }
        return true;
    }
}
