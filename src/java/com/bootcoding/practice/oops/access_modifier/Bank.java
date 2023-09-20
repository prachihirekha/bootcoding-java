package com.bootcoding.practice.oops.access_modifier;

public class Bank{
    public static void main(String[] args) {
        Account ac =new Account();
        ac.name ="prachi";
        ac.email ="prachihirekhan@gmail.com";
        ac.setPassword("pra96@chi");
        System.out.println(ac.getPassword());
    }
}
