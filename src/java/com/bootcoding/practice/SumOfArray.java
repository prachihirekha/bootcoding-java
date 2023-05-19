package com.bootcoding.practice;

public class SumOfArray {
    public static void main(String[] args) {
        int[] n = {13, 78, 7, 11};
        int evensum = 0;
        int oddsum =0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                evensum = evensum + n[i];
            }
            else{
                oddsum= oddsum+n[i];
            }

        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
