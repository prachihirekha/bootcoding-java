package com.bootcoding.practice.abstraction.usinginterface.book;

public class TextBook implements IBook{

    @Override
    public void purchase(Double amount,String name,String author) {
        System.out.println(amount);
        System.out.println(name);
        System.out.println(author);
    }
}
