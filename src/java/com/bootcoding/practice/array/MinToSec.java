package com.bootcoding.practice.array;

public class MinToSec {

        public static void main(String[] args){
            int second =0;
            int[] mins ={3,5,10,23,60};
            for (int i =0; i<mins.length;i++){
                second =mins[i]*60;
            }
            System.out.println(" 3 -> " +second);
            System.out.println(" 5 -> " +second);
            System.out.println(" 10 -> " +second);
            System.out.println(" 23 -> " +second);
            System.out.println(" 60 -> " +second);
        }
    }

