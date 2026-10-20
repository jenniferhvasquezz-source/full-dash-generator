package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();
        // Build the full name dynamically
        StringBuilder fullName = new StringBuilder(firstName);

        if (!middleName.isEmpty()) {
            fullName.append(" ").append(middleName);
        }

            fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()) {
            fullName.append(", ").append(suffix);
        }
        System.out.println("\nFull name: " + fullName.toString());
        scanner.close();
    }
}


