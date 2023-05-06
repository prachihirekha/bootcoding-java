package com.bootcoding.practice.array;
// WAP to print element of an array if second index and second last index values are same [7, 22, 19, 44, 45, 22, 17
public class SecondAndSecondLast {
    public static void main(String[] args) {
        int[] r={7, 22, 19, 44, 45, 22, 17,19};
        boolean no =false;
        if(r[1] == r[r.length-2]){
                no = true;
        }
        if(no==true){
            for(int i=0;i<r.length;i++){
                System.out.println(r[i]);
            }
        }
        for(int i=0;i<r.length;i++){
            for (int j = i+1; j <r.length ; j++) {
                if(r[i]==r[j]){
                    System.out.println(" Duplicate " + r[i]);
                }
            }
        }
    }

}
