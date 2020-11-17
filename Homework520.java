package com.homework5;

import org.xml.sax.ext.LexicalHandler;

import java.util.Random;
import java.util.Scanner;

//5.20
//( USE  FUNCTIONS FOR ROTATION!! )
//Write a function (takes a number N as input from console) creates N x N matrix
//And initializes it with random numbers in range 27 - 78
//print it
//Display a menu like this
//
//———————- MENU —————-
//Press 1 For rotating 90*
//Press 2 For rotating 180*
//Press 3 For rotating 270*
//Press 4 to Exit
//————————————————
//
//( USE  FUNCTIONS FOR ROTATION!! )
//
//After each operation program should show the menu… !!!!!!!!!
//
//DO NOT EXIT THE PROGRAM IF THE INPUT IS NOT 4 !!!!!!!!!
public class Homework520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //create matrix
        int[][] matrix = createMatrix();

        //print original matrix
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        while (true) {
            System.out.println("———————- MENU —————-");
            System.out.println("Press 1 For rotating 90*");
            System.out.println("Press 2 For rotating 180*");
            System.out.println("Press 3 For rotating 270*");
            System.out.println("Press 4 to Exit");
            System.out.println("————————————————");
            int userInput = scanner.nextInt();
            boolean exit = false;

            switch (userInput) {
                case 1:
                    matrix = rotateMatrix90degree(matrix);
                    break;
                case 2:
                    matrix = rotateMatrix180degree(matrix);
                    break;
                case 3:
                    matrix = rotateMatrix270degree(matrix);
                    break;
                case 4:
                    System.out.println("Thank you for choosing our matrix rotation program!");
                    exit = true;
            }

            if (exit) {
                break;
            }

            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }

    }
    public static int[][] createMatrix() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int dimention = scanner.nextInt();
        int[][] matrix = new int[dimention][dimention];

        for (int i = 0; i < dimention; i++) {
            for (int i1 = 0; i1 < dimention; i1++) {
                matrix[i][i1] = random.nextInt(51) + 27;
            }
        }
        return matrix;
    }
    public static int[][] rotateMatrix90degree(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix.length; i1++) {
                newMatrix[i][i1] = matrix[i1][matrix[i].length - 1 - i];
            }
        }
        return newMatrix;
    }
    public static int[][] rotateMatrix180degree(int[][] matrix) {
        matrix = rotateMatrix90degree(matrix);
        matrix = rotateMatrix90degree(matrix);
        return matrix;
    }
    public static int[][] rotateMatrix270degree(int[][] matrix) {
        matrix = rotateMatrix90degree(matrix);
        matrix = rotateMatrix90degree(matrix);
        matrix = rotateMatrix90degree(matrix);
        return matrix;
    }
}
