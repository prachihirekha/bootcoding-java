package com.bootcoding.practice.arraylist;

import java.util.ArrayList;

public class ArrayExa {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] =20;
        arr[1]=10;
        ArrayList arrayList =new ArrayList();
        arrayList.add(1);
        arrayList.add("Prachi");
        String n ="raju";
        arrayList.add('c');
        arrayList.add(true);
        System.out.println(arrayList);
        ArrayList<Integer> dataList =new ArrayList<>();
        dataList.add(10);
        dataList.add(20);
        for (int i =0;i< dataList.size();i++){
            System.out.println(dataList.get(i));
        }


    }
}
