package com.bootcoding.practice.abstraction.chocolate.loan;

public class LoanApp {
    public static void main(String[] args) {
        HomeLoan hl=new HomeLoan();
        EducationLoan el =new EducationLoan();
        CarLoan cl =new CarLoan();
        hl.bank("Bank of maharashtra");
        hl.interest(8.60);
        hl.bank("SBI");
        hl.interest(12.60);
        el.bank("HDFC");
        el.interest(9.55);
        el.bank("BOI");
        el.interest(1.70);
        cl.bank("SBI");
        cl.interest(11.99);
        hl.print();
        el.print();
        cl.print();
    }
    public void print(Loan l){
        l.print();

    }
}
