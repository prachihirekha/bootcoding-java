package com.bootcoding.practice.arraylist.difference;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // set does not follow insertion order.
        Set set =new HashSet<>();
        set.add(20);
        set.add(34);
        set.add(4567);
        set.add(234896);
        System.out.println(set);
    }
}
