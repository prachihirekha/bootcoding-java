package com.bootcoding.practice.oops.print;

public class PrintService {
   public  void print(String message){

       System.out.println(message);
   }
   public void printArray(String[] str){
       String res = "";
       for (String ss : str) {
           res = ss;
           System.out.println(res);
       }
   }
public void printTable(int num){
       for(int i=1;i<=10;i++){
           int nums=num*i;
           System.out.println(num+"*"+i+"="+nums);
       }
}
public void print(int[] arr){
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
}
    public  void printArray(long[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public void printArr(double[] a){
       for(int i=0;i<a.length;i++){
           System.out.println(a[i]);
       }
    }

}



