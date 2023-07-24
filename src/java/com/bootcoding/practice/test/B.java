package com.bootcoding.practice.test;

public class B extends A {
    private int y;
    public B(int x,int y){
        super(x);
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
