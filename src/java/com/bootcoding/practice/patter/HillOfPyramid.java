package com.bootcoding.practice.patter;

public class HillOfPyramid {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print(" ");
            }
            for (int k=1;k<i;k++){
                System.out.print("*");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
