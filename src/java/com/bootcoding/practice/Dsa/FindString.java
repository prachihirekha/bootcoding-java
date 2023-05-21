package com.bootcoding.practice.Dsa;

import org.w3c.dom.ls.LSOutput;

public class FindString {
    public static void main(String[] args) {


        String str = "Programming";
        String word = "ram";
        if (str.contains(word)) {
            System.out.println("ram exit");
        }
        //str.subString(begin, end);
        String sub = str.substring(0, 8);
        System.out.println(sub);
        String sub2 = str.substring(0, str.indexOf('i'));
        System.out.println(sub2);
    }
}
