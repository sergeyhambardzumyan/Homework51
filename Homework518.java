package com.homework5;

import java.util.Random;
import java.util.Scanner;

//5.18
//Write a function (takes a number n as input from console) to displays
//an n-by-n matrix. Initialized randomly by ‘+’ or ‘-’
public class Homework518 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userNumber = scanner.nextInt();
        //make matrix
        char[][] matrix = makeMatrix(userNumber);
        //print matrix
        printMatrix(matrix);
    }
    public static char[][] makeMatrix(int userNumber) {
        Random random = new Random();
        char[][] matrix = new char[userNumber][userNumber];
        for (int i = 0; i < userNumber; i++) {
            for (int j = 0; j < userNumber; j++) {
                if (random.nextInt(2) == 0) {
                    matrix[i][j] = '+';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }
        return matrix;
    }
    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
                System.out.print(matrix[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
