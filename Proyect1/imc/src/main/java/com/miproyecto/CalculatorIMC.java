package com.miproyecto;

import java.util.Scanner;

public class CalculatorIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double imc = describeBMI(weight, height);

        System.out.printf("Your BMI is: %.2f%n", imc);
        System.out.println(describeBMI(imc));

    scanner.close();
    }

    public static double describeBMI(double weight, double height) {
        return weight / (height * height);
    }

        public static String describeBMI(double imc) {
        if (imc < 16) {
            return "Severe thinness";
        } else if (imc >= 17) {
            return "Moderate thinness";
        } else if (imc >= 18.5) {
            return "Mild thinness";
        } else if (imc >= 25) {
            return "Normal Weight";
        } else if (imc >= 30) {
            return "Overweight";
        } else if (imc >= 35) {
            return "Mild obesity";
        } else if (imc >= 40) {
            return "Moderate obesity";
        } else {
            return "Morbid obesity";
        }
    }
}

