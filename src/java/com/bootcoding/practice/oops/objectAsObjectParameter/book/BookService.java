package com.bootcoding.practice.oops.objectAsObjectParameter.book;

public class BookService {
    public void buyBook(Book b){
       // b.getBookName();
        System.out.println("Buying Book:");
        System.out.println( b.getNumberOfPages());
        System.out.println(b.getBookName());
        System.out.println(b.getPrice());
        System.out.println(b.getAuthorName());
    }
    public void sellBook(Book i){
        System.out.println("Selling Book");
        System.out.println(  i.getNumberOfPages());
        System.out.println(  i.getAuthorName());
        System.out.println(  i.getPrice());
        System.out.println(  i.getBookName());

    }
}
