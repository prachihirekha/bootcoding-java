package com.bootcoding.practice.oops.even;

public class EvenApp {
    public static void main(String[] args) {
        EvenNumber even =new EvenNumber();
        System.out.println(even.isEven(7));
        System.out.println(even.isEven(78));
        int[] nums ={70,80,90,100};
     boolean r=  even.allEven(nums);
        System.out.println(r);
    }
}
