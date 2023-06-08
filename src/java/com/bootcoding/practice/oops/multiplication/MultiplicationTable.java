package com.bootcoding.practice.oops.multiplication;

public class MultiplicationTable {
    public long[] getMultiplicationTable(int a) {
        // return type
        long [] table =new long[10];
        for (int i = 0; i < 10; i++) {
             table[i] =a*(i+1);
          //  System.out.println(mul);
        }
        return  table;
    }
//    public long[] getMultiplication(long[] arr){
//        long[] res =new long[arr.length];
//        for(int i=0; i<arr.length;i++){
//           res[i]=getMultiplicationTable();
//        }
//        return res;
//    }
}
