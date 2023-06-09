package com.bootcoding.practice.method;

public class SmallestNumber {
    public static void main(String[] args) {
        SmallestNumber num =new SmallestNumber();
        num.smallestNumber(20,3,10);


    }
    public void smallestNumber(int i,int k,int j){
        if((i<k) && (i<j)) {
            System.out.println(" if it is a smallest number" + i);
        }
        if((k<i) &&(k<i)) {
            System.out.println("print small number =" + k);
        }
        if((j<k) && (j<i)) {
            System.out.println(" print small number =" + j);
        }
    }

}
