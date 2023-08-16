package com.bootcoding.practice.linklist;

import javax.imageio.stream.ImageInputStream;

public class InsertAtEnd {
    public static void insertAtEnd(Node head,int data){
        if(head == null){
            head = new Node(data);
            return ;
        }
        Node temp =head;
        while (temp.next !=null){
           temp= temp.next;
        }

       temp.next= new Node(data);
    }
    public static void printEndList(Node head){
        Node temp =head;
        while (temp !=null){
            System.out.println(temp.data);
           temp= temp.next;
        }
    }

    public static void main(String[] args) {
   Node head = new Node(100);
   insertAtEnd(head, 20);
   insertAtEnd(head, 500);
   insertAtEnd(head ,40);
   printEndList(head);
    }
}
