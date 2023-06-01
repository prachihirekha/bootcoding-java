package com.bootcoding.practice.oops.even;

public class EvenNumber {
    public boolean isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num);
            return true;
        }
        return false;
    }

    public boolean allEven(int[] nums) {
        int i;
        for ( i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.println(nums[i]);
                return false;
            }
           // System.out.println(nums[i]);
        }
return true;
    }
}
