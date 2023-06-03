package com.bootcoding.practice.oops.armstrong;

import com.bootcoding.practice.oops.print.PrintService;

public class ArmstrongApp {
    public static void main(String[] args) {
        ArmstrongService armstrong=new ArmstrongService();
        System.out.println( armstrong.armstrongService(371));
        int [] r ={371,49,407,10,370};
       int []res = armstrong.multipleArmstrong(r);
        PrintService p =new PrintService();
        p.print(res);
    }
}
