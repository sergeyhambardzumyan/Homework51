package com.homework5;

import java.util.Scanner;

//5.4
//get 3 numbers from console
//write a function to find the smallest number among the three numbers.
//print the smallest number
public class Homework54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        System.out.print("Please enter the first number: ");
        array[0] = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        array[1] = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        array[2] = scanner.nextInt();

        int smallValue = findSmallestNumber(array);

        printSmallestValue(smallValue);
    }
    public static int findSmallestNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void printSmallestValue(int smallValue) {
        System.out.println("The smallest value of the numbers you gave is " + smallValue);
    }
}
