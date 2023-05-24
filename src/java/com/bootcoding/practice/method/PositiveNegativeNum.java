package com.bootcoding.practice.method;

public class PositiveNegativeNum {
    public static void main(String[] args) {
        positiveNegativeNumber(-10);

    }
    public static void positiveNegativeNumber(int i){
        if(i>0){
            System.out.println("print it is Positive Number =" + i);
        }
        else if (i<0) {
            System.out.println("print : is a Negative Number =" + i);

        }
        else if (i==0){
            System.out.println("print : is a zero =" + i);
        }
    }

}
