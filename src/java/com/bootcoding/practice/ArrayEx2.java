package com.bootcoding.practice;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] nums = {11,24,60,54,39};
        //traverse array
        // find even number
        //print only even number
        for(int i=0;i < nums.length;i++){
            if(nums[i] % 2 == 0){
                System.out.println(nums[i]);
            }
        }
    }
}
