package com.bootcoding.practice.leetcode;

public class Que2529 {
    public static int positive() {
        int [] a ={-2,-1,-1,1,2,3};
        int pos=0;
        int neg=0;
        for (int num:a) {
            if (num > 0) {
                pos++;

            } else if (num < 0) {
                neg++;
            }
        }
        return Math.max(pos,neg);
    }

    public static void main(String[] args) {
        Que2529 q=new Que2529();
    int r   = q.positive();
        System.out.println(r);
    }
}
