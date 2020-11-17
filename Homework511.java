package com.homework5;

import java.util.Random;

//5.11
//Create int array [10]
//write a function that takes as a parameter array and initializes that array with random numbers
//write a function that takes as a parameter array and prints it
//Call them in main.
public class Homework511 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = initializeArray(array);
        printArray(array);

    }
    public static int[] initializeArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
