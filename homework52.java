package com.homework5;

import java.util.Scanner;

//5.2
//get 2 random numbers from console
//write a function to calculate their product
//print the product
public class homework52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();

        int product = calculateTheProduct(number1,number2);
        displayTheProduct(number1,number2,product);

    }
    public static int calculateTheProduct(int number1, int number2) {
        return number1 * number2;
    }
    public static void  displayTheProduct(int number1,int number2, int product) {
        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);
    }
}
