package com.bootcoding.practice.oops.objectAsObjectParameter.book;

public class BookApp {
    public static void main(String[] args) {
        Book book =new Book();
        book.setBookName("Nirmal");
        book.setAuthorName("Radikha");
        book.setNumberOfPages(400);
        book.setPrice(250);
        BookService b1= new BookService();
        b1.buyBook(book);
        book.setBookName("Nirmal");
        book.setAuthorName("Radikha");
        book.setNumberOfPages(400);
        book.setPrice(300);
        b1.sellBook(book);

    }
}
