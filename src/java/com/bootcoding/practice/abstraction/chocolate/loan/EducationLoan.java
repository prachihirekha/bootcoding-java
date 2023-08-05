package com.bootcoding.practice.abstraction.chocolate.loan;

public class EducationLoan extends Loan{
    @Override
    void interest(double rate) {

        double rti=rate;
        System.out.println("Rate of interest :"+rti);
    }

    @Override
    void bank(String name) {
        String n =name;
        System.out.println("Name of the Bank :"+ n);

    }
}
