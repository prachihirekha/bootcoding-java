package com.bootcoding.practice.oops.cube;

import com.bootcoding.practice.oops.print.PrintService;

public class CubeApp {
    public static void main(String[] args) {
        CubeService cube =new CubeService();
        System.out.println("Singe Number of Cube:  "+cube.cubeService(5));
        int [] r ={2,3,5,6};
        System.out.println("Multiple number of cube :");
        int [] res =cube.multipleCube(r);
        PrintService cubePrint=new PrintService();
        cubePrint.print(res);
    }
}
