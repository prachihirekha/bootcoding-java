package com.bootcoding.practice.abstraction.chocolate.loan;

public class HomeLoan extends Loan{
    @Override
    void bank(String name) {
      String nam =name;
        System.out.println("Name of the Bank :"+nam);

    }

    @Override
    void interest(double rate) {
        double r =rate;
        System.out.println( "Rate of interest :"+r);
    }
}
