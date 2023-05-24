package com.bootcoding.practice.method;

public class VowelCharacter {
    public static void main(String[] args) {
        VowelCharacter s =new VowelCharacter();
       boolean ans = s.vowelCharacter('a');
        System.out.println(ans);
    }
    public boolean vowelCharacter(char ch) {
       return  ch =='a' || ch == 'e'|| ch =='i'||ch=='o'||ch =='u' ;
    }
    }



