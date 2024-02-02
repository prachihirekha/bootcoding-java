package com.bootcoding.practice.basic.core.java.oops.abstrction;

abstract class Bike {
    void bike(){
        System.out.println(" BIke is Started to brum! brum!");
    }
   abstract void run();
    abstract void stop();
    abstract  void ABS();
    void changeGare(){
        System.out.println("Bike change there gare !");
    }
}
