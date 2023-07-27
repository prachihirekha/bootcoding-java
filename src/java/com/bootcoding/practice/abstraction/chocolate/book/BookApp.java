package com.bootcoding.practice.abstraction.chocolate.book;

public class BookApp {
    public static void main(String[] args) {
        TextBook tb =new TextBook();
        AudioBook ab =new AudioBook();
        EBook eb =new EBook();
        tb.purchase(150.0);
        ab.purchase(250.00);
        eb.purchase(300.5);
        tb.print();
        ab.print();
        eb.print();
    }
    public void print(Book book){
        book.print();

    }
}
