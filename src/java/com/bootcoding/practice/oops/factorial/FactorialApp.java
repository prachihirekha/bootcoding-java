package com.bootcoding.practice.oops.factorial;

import com.bootcoding.practice.oops.multiplication.MultiplicationTable;
import com.bootcoding.practice.oops.print.PrintService;

public class FactorialApp {
    public static void main(String[] args) {
        FactorialService fs =new FactorialService();
        long [] num ={2,4,5,8,9};
        long [] res = fs.getFacts(num);
        //.getFact(5);
       PrintService ps =new PrintService();
        System.out.println("Input Array :");
        ps.printArray(num);
        System.out.println("Output Array :");
        ps.printArray(res);
        MultiplicationTable multiple = new MultiplicationTable();
        System.out.println("\nMultiplication Table :");
        long [] multiplicationTable =multiple.getMultiplicationTable(10);

        ps.printArray(multiplicationTable);
    }
}
