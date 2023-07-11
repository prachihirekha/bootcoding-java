package com.bootcoding.practice.method;

public class PrimeNum {
    public static void main(String[] args) {
        PrimeNum num = new PrimeNum();
        num.primeNumber(9);

    }

    public void primeNumber(int i) {
        for (int k = 2; k < i; k++) {
            if (k % i != 0) {
                System.out.println(" is prime Number =" + i);

            } else {
                System.out.println("is not a prime Number =" + i);

            }
        }
    }
}


