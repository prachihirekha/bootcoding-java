package com.bootcoding.practice.leetcode;

public class RomanToInteger {
    public static int que() {
        String s = "";
        int nums = 0;
        while (nums >= 1000) {
            s += "M";
            nums = -1000;
        }
        if (nums >= 900) {
            s += "cm";
            nums = -900;


        }
        if (nums >= 500) {
            s += "D";
            nums = -500;
        }
        if (nums >= 400) {
            s += "CD";
            nums = -400;


        }
        if (nums >= 100) {
            s += "C";
            nums = -100;


        }
        if (nums >= 90) {
            s += "LC";
            nums = -90;
        }
        if (nums >= 50) {
            s += "L";
            nums = -50;
        }
        if (nums >= 40) {
            s += "XL";
            nums = -40;
        }
        if (nums >= 10) {
            s += "X";
            nums = -10;


        }
        if (nums >= 9) {
            s += "IX";
            nums = -9;


        }
        if (nums >= 5) {
            s += "V";
            nums = -5;
        }
        if (nums >= 4) {
            s += "IV";
            nums = -4;
        }
        if (nums >= 1) {
            s += "I";
            nums = -1;
        }
       return nums;

    }

    public static void main(String[] args) {
        RomanToInteger rm =new RomanToInteger();
     int r= rm.que();
        System.out.println(r);
    }
}