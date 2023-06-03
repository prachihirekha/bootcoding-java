package com.bootcoding.practice.oops.armstrong;

public class ArmstrongService {
    public boolean armstrongService(int num) {
        int rem = 0;
        int sum = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (sum == temp) {
            return true;


        }
        return false;
    }

    public int[] multipleArmstrong(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean armstrong =armstrongService(arr[i]);
            if (armstrong) {
                res[i] = arr[i];
            }

        }
        return res;
    }
}

