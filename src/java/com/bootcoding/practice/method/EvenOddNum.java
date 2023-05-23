package com.bootcoding.practice.method;

public class EvenOddNum {
    public static void main(String[] args) {
        EvenOddNum k =new EvenOddNum();
        k.evenOddNum(6);

    }
    public void evenOddNum( int j){
        if(j%2 ==0){
            System.out.println("print even num" + j);
        }
        else{
            System.out.println("print odd num =" +j);
        }
    }

}
