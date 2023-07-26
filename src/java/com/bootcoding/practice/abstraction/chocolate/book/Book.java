package com.bootcoding.practice.abstraction.chocolate.book;

public abstract class Book {
      abstract  void purchase(Double amount);
      public String title;
      public double cost;
      public  void print(){
          System.out.println(title);
            System.out.println(cost);

      }

      }

