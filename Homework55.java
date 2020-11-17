package com.homework5;

import java.util.Scanner;

//5.5
//get a string from console
//write a function to display the middle character of a string.
public class Homework55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userInput = scanner.nextLine();

        char middleCharacter = findTheMiddleCharacter(userInput);

        displayTheCharacter(userInput,middleCharacter);
    }
    public static char findTheMiddleCharacter(String userInput) {

        char middleCharacter = ' ';

        if (userInput.length() % 2 == 0) {
            middleCharacter = leftOrRightMiddleCharacter(userInput);
        } else if (userInput.length() % 2 != 0) {
            middleCharacter = userInput.charAt((userInput.length() - 1) / 2 );
        }
        return middleCharacter;
    }
    public static char leftOrRightMiddleCharacter(String userInput) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press 1 if you would like to get left char of middle or 2 for the right char: ");
        int userSelection = scanner.nextInt();
        if (userSelection == 1) {
            return userInput.charAt((userInput.length() / 2) - 1 );
        } else
            return userInput.charAt(userInput.length() / 2);
    }
    public static void displayTheCharacter(String userInput, char middlecharacter) {
        System.out.println("The middle character of " + userInput + " is " + middlecharacter);
    }
}
