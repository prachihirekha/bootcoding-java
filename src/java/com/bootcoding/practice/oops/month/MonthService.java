package com.bootcoding.practice.oops.month;

public class MonthService {
    String[] monthName = {"January", "February", "March", "April", "May", "June", "july", "August", "September", "October", "November", "December"};

    public String getMonth(int num) {

        if (num > 12) {
            System.out.println("value should be return in between 1-12");
        }
        return monthName[num - 1];
    }


    public String[] printMonth(int[] monthName) {
        String[] r = new String[monthName.length];
        for (int i = 0; i < monthName.length; i++) {
          r[i]=getMonth(monthName[i]);
            System.out.println(r[i]);
        }
        return r;
    }
}



