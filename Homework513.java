package com.homework5;

import java.util.Random;

//5.13
//initialize an array [10] with random numbers
//write a function that takes as an argument an array and returns the array sorted in desc order
//print
public class Homework513 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        array = arraySortToDescOrder(array);
        printArray(array);

    }
    public static int[] arraySortToDescOrder(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int i1 = i; i1 < array.length; i1++) {
                if (array[i] < array[i1]) {
                    temp = array[i1];
                    array[i1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
