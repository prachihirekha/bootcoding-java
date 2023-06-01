package com.bootcoding.practice.method;

public class IntegerNumberSum {
    public int FindingSum(int num) {
        int sum= 0;
        while (num > 0) {
            int res = num % 10;
            sum = sum + res;
            num = num / 10;
        }
        System.out.println(sum);

        return sum;
    }


    public static void main(String[] args) {
        IntegerNumberSum result = new IntegerNumberSum();
        result.FindingSum(2587);
    }
}