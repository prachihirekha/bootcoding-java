package com.bootcoding.practice.leetcode;

public class EvenNumberOfDigits {
    public int arrList(){
        int nums[] ={12,345,2,6,7896};
        int ans =0;
        for(int i=0;i< nums.length;i++){
            int digits =0;
            while(nums[i]>0){
                digits++;
            nums[i] /=10;
        }
            if(digits%2==0){
                ans++;
            }
    }
        return ans;
}

    public static void main(String[] args) {
        EvenNumberOfDigits ev =new EvenNumberOfDigits();
               int ans= ev.arrList();
        System.out.println(ans);
    }
}
