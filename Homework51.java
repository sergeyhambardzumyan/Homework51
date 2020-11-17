package com.homework5;

import java.util.Random;

//5.1
//generate 2 random numbers
//write a function to calculate their sum
//print the sum
public class Homework51 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(99);
        int number2 = random.nextInt(99);
        int sum = calculateTheSumOfTwoNumbers(number1,number2);
        displayTheSumOfTwoNumbers(number1,number2,sum);
    }

    public static int calculateTheSumOfTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }
    public static void  displayTheSumOfTwoNumbers(int number1,int number2, int sum) {
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }
}
