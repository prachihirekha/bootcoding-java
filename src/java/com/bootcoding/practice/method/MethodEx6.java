package com.bootcoding.practice.method;
// wap Division of two variable using method.
public class MethodEx6 {
    public static void main(String[] args) {
        printDivisible(25,6);
        printDivisible(234,7);
        printDivisible(65,4);

    }
    public static void printDivisible(int x, int y){
        int z =x/y;
        System.out.println("divided of" + x +  " & " + y + " = " + z);
    }

}
