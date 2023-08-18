package com.bootcoding.practice.abstraction.chocolate.loan;

import com.bootcoding.practice.Coupling.BankAccount;

public abstract class Loan {
   abstract void  bank(String name);
   abstract void interest (double rate);


   public void print(){
      System.out.println();

   }
}
