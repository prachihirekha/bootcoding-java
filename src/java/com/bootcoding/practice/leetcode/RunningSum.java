package com.bootcoding.practice.leetcode;

public class RunningSum {
    public static int[] array(){
        int nums[] ={1,2,3,4,5};


        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            System.out.println(nums[i]);
        }
        return nums;
}

    public static void main(String[] args) {
        RunningSum rs =new RunningSum();
        rs.array();
    }

    }
