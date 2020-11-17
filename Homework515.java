package com.homework5;

import java.util.Random;

//5.15
//initialize an array [10] with random numbers
//write a function that takes as an argument an array and returns the reversed array
//print
public class Homework515 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        //initialize
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        //print initial array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        array = reverseAnArray(array);
        System.out.println();
        printReversedArray(array);

    }
    public static int[] reverseAnArray(int[] array) {
        for (int i = 0; i < array.length/2 - 1; i++) {
                int temp = array[9 - i];
                array[9 - i] = array[i];
                array[i] = temp;
        }
        return array;
    }
    public static void printReversedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
