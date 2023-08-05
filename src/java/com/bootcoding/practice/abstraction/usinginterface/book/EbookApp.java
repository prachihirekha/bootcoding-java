package com.bootcoding.practice.abstraction.usinginterface.book;

public class EbookApp {
    public static void main(String[] args) {
        AudioBook1 ab =new AudioBook1();
        TextBook tb =new TextBook();
        Ebook1 eb=new Ebook1();
        ab.purchase(350.0,"Peter Pan","Peter");
        tb.purchase(120.00,"Atomic Habits","hobbies");
        eb.purchase(250.0,"Happy camper EBook","happy");
    }
}
