package com.homework5;

import java.util.Scanner;

//5.6
//get a sentence from console
//write a function to count all words in a string.
//print count;
public class Homework56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
         int count = countAllWords(sentence);
        displayAllWordsInTheString(count);
    }
    public static int countAllWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }
    public static void displayAllWordsInTheString(int count) {
        System.out.println("The sentence has " + count + " words!");
    }
}
