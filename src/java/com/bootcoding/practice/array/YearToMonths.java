package com.bootcoding.practice.array;

public class YearToMonths {
    public static void main(String[] args){
        double months =0;
        double[] years ={1, 2.5, 3.2, 10.5, 15};
        for(int i=0;i<years.length;i++){
            months =years[i]*12;
            System.out.println(months);
        }

    }
}

