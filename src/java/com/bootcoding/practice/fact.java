package com.bootcoding.practice;

public class fact {
    public static void main(String[] args) {
        int n=3;
        int i=1;
        int fact =1;
        while(i<=n){
          fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
