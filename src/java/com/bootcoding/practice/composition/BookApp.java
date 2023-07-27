package com.bootcoding.practice.composition;

import java.util.Arrays;

public class BookApp {
    public static void main(String[] args) {
        Author author =new Author();
        author.setAge(20);
        author.setName("Lemeno");
        Author author1 =new Author();
      author1.setName("King");
        Publication publisher= new Publication();
        publisher.setCompanyName("KBT");
        publisher.setAddress("Korea" );
        publisher.setSince(1997);
        Book myBook =new Book();
        myBook.setPublisher(publisher);
        myBook.setTitle("Crack your Exam");
        Author[] authors =new Author[2];
        authors[0]=author;
        authors[1]=author1;
        myBook.setAuthors(authors);
        PrintMethod print =new PrintMethod();
        print.print(myBook);


    }
}



