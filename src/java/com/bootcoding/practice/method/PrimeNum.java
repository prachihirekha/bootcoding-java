package com.bootcoding.practice.method;

public class PrimeNum {
    public static void main(String[] args) {
        PrimeNum num = new PrimeNum();
        num.primeNumber(10);

    }

    public void primeNumber(int i) {
        if ( i % 2 != 0) {
            System.out.println(i+" is prime Number =" );
        }
        else
            {
                System.out.println(i +"is not a prime Number =" );
            }
        }
    }


