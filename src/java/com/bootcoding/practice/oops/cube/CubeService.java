package com.bootcoding.practice.oops.cube;

public class CubeService {
    public int cubeService(int num) {

            int cube= num * num * num;

        return cube;
    }
    public int[] multipleCube(int[] arr){
        int res[] =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i] =cubeService(arr[i]);
        }
        return res;
    }
}

