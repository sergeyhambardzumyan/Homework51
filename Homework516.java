package com.homework5;

import java.util.Scanner;

//5.16
//Palindrome Check
//A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
//Write a boolean returning method that detects if a string is a palindrome.
//Hint: Use word.charAt(i) to get the character at position i.
public class Homework516 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string to check if it is palindrom or not: ");
        String userString = scanner.nextLine();

        if(isPalindrome(userString)) {
            System.out.println("The string is palindrome!");
        } else {
            System.out.println("The string is not palindrome");
        }
    }
    public static boolean isPalindrome(String userString) {
        int count = 0;
        for (int i = 0; i < userString.length() / 2; i++) {
            if (userString.charAt(i) == userString.charAt(userString.length() - 1 - i)) {
                count++;
            }
        }
        if (count == userString.length() / 2) {
            return true;
        } else {
            return false;
        }
    }
}
