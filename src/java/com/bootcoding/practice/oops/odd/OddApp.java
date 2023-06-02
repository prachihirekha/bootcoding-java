package com.bootcoding.practice.oops.odd;

public class OddApp {
    public static void main(String[] args) {
        OddNumber odd =new OddNumber();
       boolean k = odd.isOdd(7);
        System.out.println("This is  odd :"+k);
        boolean p = odd.isOdd(78);
        System.out.println("This is  odd :"+p);
        int [] nums ={115,33,45,9};
        System.out.println(odd.allOddNum(nums));
    }
}
