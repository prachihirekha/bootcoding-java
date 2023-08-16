package com.bootcoding.practice.abstraction.usinginterface.loan;

public class HomeLoan implements Loan{
    @Override
    public void purchase(String name, double rate) {
        System.out.println(name);
        System.out.println(rate);
    }
}
