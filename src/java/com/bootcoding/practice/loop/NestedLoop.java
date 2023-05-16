package com.bootcoding.practice.loop;

public class NestedLoop {
    public static void main(String[] args){
        for(int i=0;i<=2;i++){
            System.out.println("outer:" +i);
            for(int j=0; j<=3; j++){
                System.out.println("inner:" +j);
            }
        }
    }
}
