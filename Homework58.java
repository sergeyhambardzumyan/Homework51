package com.homework5;

import java.util.Scanner;

//5.8
//get the password from console (String)
//write a function to check whether a string is a valid password or not
//Password rules:
//-- A password must have at least ten characters.
//-- A password consists of only letters and digits.
//-- A password must contain at least two digits.
//print isValid or not;
public class Homework58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the password: ");
        String password = scanner.nextLine();
        boolean valid = isValidPassword(password);

        if (valid) {
            System.out.println("The password is VALID");
        } else {
            System.out.println("The password is NOT VALID");
        }
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
            int count = 0;
            int digitcount = 0;
        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') || (password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    digitcount++;
                }
                count++;
            }
        }


        if ((count == password.length()) && (digitcount >= 2)){
            return true;
        } else
            return false;
    }
}
