package com.bootcoding.practice.object;

public class LockApp {
    public static void main(String[] args) {
        Lock v= new Lock();
      v.lockQuality(6.5,"Blue","50","Spider");
        System.out.println(v.dimensions);
        System.out.println(v.color);
        System.out.println(v.price);
        System.out.println(v.brand);
    }
}
