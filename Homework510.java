package com.homework5;

import java.util.Scanner;

//5.10
//get sides of the triangle
//write a function to check if the triangle with those sides is a valid triangle
//write a function to calculate the perimeter of the triangle
//write a function to calculate the area of the triangle
//in case the triangle is valid
//	- calculate perimeter
//	- calculate area
//print both
public class Homework510 {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter sides of the triangle: ");
            side1 = scanner.nextInt();
            side2 = scanner.nextInt();
            side3 = scanner.nextInt();

            boolean isValid = isValidTriangle(side1,side2,side3);
            if (isValid) {
                break;
            }
            System.out.println();
            System.out.println("Please enter valid triangle sides!");
        }

        System.out.println("The area of the triangle is " + calculateTheAreaOfTriangle(side1,side2,side3));
        System.out.println("The perimeter of the triangle is " + calculateThePerimeterOfTriangle(side1,side2,side3));
    }

    public static boolean isValidTriangle(int side1, int side2, int side3) {
        if ((side1 + side2) >= side3 && (side1 + side3) >= side2 && (side2 + side3) >= side1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static int calculateTheAreaOfTriangle(int side1, int side2, int side3) {
        double average = (side1 + side2 + side3) / 2;

        return (int) Math.sqrt(average*(average - side1)*(average - side2)*(average - side3));
    }
    public static int calculateThePerimeterOfTriangle(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }
}
