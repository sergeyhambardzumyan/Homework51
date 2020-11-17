package com.homework5;

import java.util.Random;
import java.util.Scanner;

//5.19
//Write a function (takes a number N as input from console) creates N x N matrix
//And initializes it with random numbers in range 27 - 78
//
//Write a function to rotate that matrix 90*
//Write a function to rotate that matrix 180*
//Write a function to rotate that matrix 270*
public class Homework519 {
    public static void main(String[] args) {
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

        //Rotate the matrix 90*
        matrix = rotateMatrix90degree(matrix);

        //print 90* rotated matrix
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Rotate the matrix 180*
        matrix = rotateMatrix180degree(matrix);

        //print 180* rotated matrix
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Rotate the matrix 270*
        matrix = rotateMatrix270degree(matrix);

        //print 270* rotated matrix
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


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
        return rotateMatrix90degree(matrix);
    }

    public static int[][] rotateMatrix270degree(int[][] matrix) {
        return rotateMatrix90degree(matrix);
    }

}
