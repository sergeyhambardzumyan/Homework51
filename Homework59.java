package com.homework5;

import java.util.Scanner;

//5.9
//get radius from console
//write a function to calculate the area of the circle
//write a function to calculate the perimeter of the circle
public class Homework59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        System.out.println("The Area of the circle is " + calculateTheAreaOfTheCircle(radius));
        System.out.println("The Perimeter of the circle is " + calculateThePerimeterOfTheCircle(radius));


    }
    public static  int calculateTheAreaOfTheCircle(int radius) {
        return (int) (Math.PI * radius * radius);
    }
    public static  int calculateThePerimeterOfTheCircle(int radius) {
        return (int) (2 * Math.PI * radius);
    }
}
