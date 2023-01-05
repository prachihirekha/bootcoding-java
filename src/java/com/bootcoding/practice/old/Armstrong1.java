package com.bootcoding.practice.old;

public class Armstrong1 {
    public static void main(String[] args) {
        int[] num = {153,370,111,371,120,};

        int i;

        int temp = 0;
        for (i = 0; i < num.length; i++) {

            int n = num[i];
            temp = n;
            int sum = 0;  
           while (n != 0) {

               int rem = n % 10;

               sum = sum + (rem * rem * rem);
              n=n/10;
           }
            if (sum == temp){
                System.out.println(temp + " Armstrong ");
            }else{
                System.out.println(temp + " Not Armstrong ");
            }
        }
        }




    }