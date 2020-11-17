package com.homework5;

import java.util.Scanner;

//5.3
//get 2 numbers from console
//write a function to calculate their product
//write a function to calculate cube of the product
//print the cube of the product
public class Homework53 {
    public static void main(String[] args) {
        //get 2 numbers from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();
        //calculate
        int product = calculateTheProduct(number1,number2);
        int cubeOfProduct = calculateTheCubeOfTheProduct(product);
        //display
        displayTheProductAndCubeOfProduct(number1,number2,product,cubeOfProduct);
    }
    public static int calculateTheProduct(int number1, int number2) {
        return number1 * number2;
    }
    public static int calculateTheCubeOfTheProduct(int product) {
        return (int)(Math.pow(product,3));
    }
    public static void  displayTheProductAndCubeOfProduct(int number1,int number2, int product, int cubeOfProduct) {
        System.out.println("The product of " + number1 + " and " + number2 + " is " + product);
        System.out.println("The cube of product is " + cubeOfProduct);
    }
}
