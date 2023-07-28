package com.bootcoding.practice.abstraction.chocolate.loan;

public class CarLoan extends Loan {
    @Override
    void bank(String name) {
        String n =name;
        System.out.println("Name of the Bank :"+n);
    }

    @Override
    void interest(double rate) {
        double rt=rate;
        System.out.println("Rate of interest :"+rt);
    }
}
