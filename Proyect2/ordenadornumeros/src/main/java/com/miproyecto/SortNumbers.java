package com.miproyecto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers (Enter 'f' Wrapping Up):");
        while (true) {
            String entrance = scanner.next();
            if (entrance.equalsIgnoreCase("f")) {
                break;
            }
            try {
                int number = Integer.parseInt(entrance);
                if (number == 4) {
                    System.out.println("The number 4 is not allowed.");
                } else {
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please, enter a valid number.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter 'A' for ascending order or 'D' for descending order: ");
        char opcion = scanner.next().charAt(0);

        if (opcion == 'A' || opcion == 'a') {
            Collections.sort(numbers);
        } else if (opcion == 'D' || opcion == 'd') {
            Collections.sort(numbers, Collections.reverseOrder());
        } else {
            System.out.println("Invalid option. By default, ascending order will be used.");
            Collections.sort(numbers);
        }

        scanner.close();

        System.out.println("Sorted Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
    }
}