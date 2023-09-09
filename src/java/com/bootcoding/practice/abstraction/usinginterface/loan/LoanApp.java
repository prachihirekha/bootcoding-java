package com.bootcoding.practice.abstraction.usinginterface.loan;

public class LoanApp {
    public static void main(String[] args) {
        CarLoan c =new CarLoan();
        EducationLoan e =new EducationLoan();
        HomeLoan h =new HomeLoan();
        System.out.println("CarLoan : ");
        c.purchase("SBI",8.9);
        System.out.println("Education Loan : ");
        e.purchase("HDFC",1.7);
        System.out.println("HomeLoan :");
        h.purchase("BOI",9.99);
    }
}
