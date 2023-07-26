package com.bootcoding.practice.arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>();
        // add element
        list.add(0);
        list.add(11);
        list.add(234);
        list.add(36);
        System.out.println(list);
        //get element
      int e = list.get(2);
        System.out.println(e);
        // add element in between
        list.add(1,122);
        System.out.println(list);
        //element set
        list.set(1,121);
        list.set(3, 902);
        System.out.println(list);
        // element delete
        list.remove(1);
        System.out.println(list);
        // to find the size of the list
        int size=list.size();
        System.out.println(size);
        // loop
        for(int i =0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        // to find shorting list;o
        Collections.sort(list);
        System.out.println(list);
    }
}
