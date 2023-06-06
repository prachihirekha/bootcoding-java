package com.bootcoding.practice.method;

public class SwitchCase {
    public static void main(String[] args) {
       boolean ans = getVowel('e');
        System.out.println(ans);

    }
    public  static boolean getVowel(char ch) {
        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;

        }
    }

}
