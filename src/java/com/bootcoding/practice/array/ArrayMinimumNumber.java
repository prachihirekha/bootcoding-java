package com.bootcoding.practice.array;
// WAP to find min element of an array
public class ArrayMinimumNumber {
    public static void main(String[] args) {
        int [] s={900,40,80,50};
        int min=s[0];
         for(int j=0;j<s.length;j++){
            if(min > s[j]){
           //     secondmin =min;
                min =s[j];
            }
        }
        System.out.println(min);
    }
}
