package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in); // this is how the user will change the variable.
        // do loop will continue only if the users entry was not valid
        do {
            System.out.println("Please enter the number of your selection");
            System.out.println("");
            System.out.println("1. Hamburger");
            System.out.println("2. Hamburger with ketchup");
            System.out.println("3. Cheeseburger");
            System.out.println("4. Cheeseburger with ketchup");
            System.out.println("5. Small Fries");
            System.out.println("6. Large Fries");
            System.out.println("7. Exit");

            choice = scanner.nextInt();

            //Blank print outputs for formatting.
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("You have Selected: ");

            if (choice == 1) {
                System.out.println("1. Hamburger");

            } else if (choice == 2) {
                System.out.println("2. Hamburger with ketchup");

            } else if (choice == 3) {
                System.out.println("3. Cheeseburger");


            } else if (choice == 4) {
                System.out.println("4. Cheeseburger with ketchup");

            } else if (choice == 5) {
                System.out.println("5. Small Fries");

            } else if (choice == 6) {
                System.out.println("6. Large Fries");

            } else if (choice == 7) {
                break;

            } else {
                System.out.println("Invalid choice, try again");
            }

        } while (choice < 1 || choice > 7); // the loop will continue while the choice is not on the menu
    }
}