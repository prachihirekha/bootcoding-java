package com.bootcoding.practice.arraylist.difference;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // list follow the insertion order
        List list =new ArrayList<>();
        list.add(10);
        list.add(1,20);
        list.add(30);
        list.add(40);
        System.out.println(list);

    }
}
