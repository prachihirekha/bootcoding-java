package com.bootcoding.practice.Dsa;

import java.sql.SQLOutput;

public class Split {
    public static void main(String[] args) {
        String str ="Java is platform Independent";
        System.out.println(str.length());
        String[] tokens =str.split(" ");
        System.out.println(tokens.length);
        String skills ="C,C++,java,python";
        System.out.println(skills.length());
    }
}
