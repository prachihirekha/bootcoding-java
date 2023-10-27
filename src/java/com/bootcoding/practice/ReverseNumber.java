package com.bootcoding.practice;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(number(1534236469));
    }

        public static int number(int k) {
            int rev = 0;

            while (k != 0) {
                int digit = k % 10;
                //int Integer;
                if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                    return 0;
                }
                k = k / 10;
                rev = (rev * 10) + digit;

            }
            return rev;
        }
}
