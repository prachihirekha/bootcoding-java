package com.bootcoding.practice.basic.core.java.array.searching;

public class BinarySearch {
    int binarySearch(int arr[], int first,int last,int x) {
        if (first<=last) {
            int mid = (first+last) / 2;
            if (arr[mid] == x)
                return mid;
            if(arr[mid]>x)
                return  binarySearch(arr,first,mid-1,x);
            return  binarySearch(arr,mid+1,last,x);
            }
        return -1;
    }

}
