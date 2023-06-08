package com.bootcoding.practice.oops.power;

public class PowerService {
    public  double powerService(double num){
        double p=Math.pow(num,2);
       return p;
    }
    public double[] multiplePowerService(double []nums){
        double res[]=new double[nums.length];
        for(int i=0;i< nums.length;i++){
            res[i] =powerService(nums[i]);
        }
        return res;
    }

}

