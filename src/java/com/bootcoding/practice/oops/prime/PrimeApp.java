package com.bootcoding.practice.oops.prime;

public class PrimeApp {
    public static void main(String[] args) {


        PrimeNumber primeNumber =new PrimeNumber();
        System.out.println(primeNumber.isPrime(1));
        System.out.println(primeNumber.isPrime(78));
        int[] numbers ={1,2,3,7,5};
        System.out.println(primeNumber.allPrime(numbers));
    }
}
