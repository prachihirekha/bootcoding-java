package com.bootcoding.practice.scanner;

import java.util.Scanner;

public class FindMaxInMethod {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the size of array :");
            int n = scanner.nextInt();
            if ((n < 0)) {
                break;
            }

            int[] arr = takeFromUser(n, scanner);
            int res =0;
          res=  FindMaximumElement(arr);
            System.out.println("The maximum element is " + res);
        }


    }
    public static int[] takeFromUser(int n, Scanner scanner){
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the number of arr["+ i +"]");
            arr[i] = scanner.nextInt();

        }
        return arr;
    }

    public static int FindMaximumElement(int[] arr){
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
        if(max < arr[i]);
        max =arr[i];
        }
        System.out.println(max);
        return max;

    }
}
