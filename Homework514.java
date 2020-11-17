package com.homework5;

//5.14
//Write a method to print all prime numbers less than 100.
//Call in in main
public class Homework514 {
    public static void main(String[] args) {
        printPrimeNumbers();
    }
    public static void printPrimeNumbers() {
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
