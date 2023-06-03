package com.bootcoding.practice.oops.armstrong;

public class ArmstrongService {
    public int armstrongService(int num ){
       int rem =0;
       int sum =0;
       int temp =num;
       while (num!=0){
           rem =num%10;
           sum =sum +(rem*rem*rem);
           num =num/10;
       }
       if(sum ==temp){
          return 1;


       }
       return 0;
    }
   public int[] multipleArmstrong(int[] arr){
        int[] res =new int[arr.length];
        for(int i=0 ;i<arr.length;i++){
            res[i]=armstrongService(arr[i]);
        }
        return res;
    }
}
