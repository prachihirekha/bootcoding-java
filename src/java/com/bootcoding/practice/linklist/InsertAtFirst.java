package com.bootcoding.practice.linklist;

import org.w3c.dom.*;

public class InsertAtFirst {
    public static Node insertFirstNode(Node head) {
        Node newNode = new Node(20) ;
            newNode.next =head;
            head =newNode;
            return head;
        }
        public static Node createNode(){
        Node firstNode =new Node(1);
        Node secondNode =new Node(20);
        Node thirdNode =new Node(33);
        Node forthNode =new Node(222);
        Node fifthNode =new Node(13);
        Node head =firstNode;
        firstNode.next = secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=forthNode;
        forthNode.next =fifthNode;
        fifthNode.next=null;
        return head;
        }
        public static void printListNode(Node head){
       Node temp= head;
       while(temp!= null){
           System.out.println(temp.data);
         temp=temp.next;
       }
        }

    public static void main(String[] args) {
        Node head =createNode();
        System.out.println("before");
       printListNode(head);
        System.out.println("after");
        head =insertFirstNode(head);
        printListNode(head);
    }
}
