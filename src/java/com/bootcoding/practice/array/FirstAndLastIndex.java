package com.bootcoding.practice.array;
//WAP to print element of an array if first index and last index values are same [7, 22, 19, 44, 45, 65, 7]
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] v = {7, 22, 19, 44, 45, 65, 7};

        boolean yes =false;
        if (v[0] == v[v.length - 1]) {
            yes = true;
        }


        if(yes==true) {
            for (int j = 0; j < v.length; j++) {
             System.out.println(v[j]);
            }
        }
    }
}


