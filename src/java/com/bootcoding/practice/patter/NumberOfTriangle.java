package com.bootcoding.practice.patter;

public class NumberOfTriangle {
    public static void main(String[] args) {
      int   count =0;
        for (int i = 1; i <=4; i++) {
            for(int s=4;s>=i;s--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                count++;
                System.out.print( count +" ");

            }
            System.out.println();
        }
    }
}
