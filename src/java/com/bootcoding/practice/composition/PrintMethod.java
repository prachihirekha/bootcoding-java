package com.bootcoding.practice.composition;



public class PrintMethod {
    public void print(Book myBook){
        System.out.println( myBook.getTitle());
    Author[] authors =myBook.getAuthors();
    for(int i=0;i<authors.length;i++){
        System.out.println(authors[i].getName());
    }
        System.out.println(myBook.getPublisher().getCompanyName());
        System.out.println(myBook.getPublisher().getAddress());
        System.out.println(myBook.getPublisher().getSince());

    }

}
