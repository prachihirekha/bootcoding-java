package com.bootcoding.practice.leetcode;

public class GreaterAndSmallest {
     public int countElements(int[] a) {
        int n=a.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int z:a)
        {
            max=Math.max(max,z);
            min=Math.min(min,z);
        }
        int count=0;
        for(int z:a)
        {
            if(z>min && z<max)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        GreaterAndSmallest gs =new GreaterAndSmallest();
        int arr[]={11,2,7,15};
        int s =gs.countElements(arr);
        System.out.println(s);

    }
}
