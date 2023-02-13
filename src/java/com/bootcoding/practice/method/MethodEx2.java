package com.bootcoding.practice.method;

public class MethodEx2 {
    public static void main(String[] args) {
       printEvenNumber();
    }
    public static void printEvenNumber(){
        int num =24;
        //logic for even - if condition
        //logic for print multiple times - for loop
        for (int i =2; i<=num;i++){
            if (i%2==0){
                System.out.println(i +" =is even number");
            }
        }
    }

}
