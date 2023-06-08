package com.bootcoding.practice.oops.power;

import com.bootcoding.practice.oops.print.PrintService;

public class PowerApp {
    public static void main(String[] args) {
        PowerService power =new PowerService();
        System.out.println(" Single Square :"+  power.powerService(5));
        double[] arr ={2,4,5,7};
        System.out.println("Multiple Square Number :");
       double[] res = power.multiplePowerService(arr);
       PrintService n =new PrintService();
       n.printArr(res);
    }
}
