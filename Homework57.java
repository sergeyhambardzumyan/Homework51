package com.homework5;

import java.util.Scanner;

//5.7
//get the year from console (int)
//write a function to check whether a year entered by the user is a leap year or not.
//print
public class Homework57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year = scanner.nextInt();

        boolean leap = isLeap(year);
        if (leap) {
            System.out.println("The year " + year + " is leap");
        } else {
            System.out.println("The year " + year + " is not leap");
        }

    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
