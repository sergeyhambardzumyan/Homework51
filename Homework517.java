package com.homework5;

import java.util.Scanner;

//5.17
//write a function that takes as an argument int number and calculates its factorial
//print
public class Homework517 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number to calculate its factorial: ");
        int userNumber = scanner.nextInt();

        int factorial = calculateFactorial(userNumber);
        System.out.println("The factorial of the number " + userNumber + " is " + factorial);
    }
    public static int calculateFactorial(int usernumber) {
        int factorial = 1;
        for (int i = 1; i <= usernumber; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
