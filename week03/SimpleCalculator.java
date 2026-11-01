/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Student Name : Irofuala Daniel
 * Matric Number: 25/17793
 * Programme    : Computer Science
 *
 * Asks the user for two numbers and prints the result of the five
 * arithmetic operators: +, -, *, / and %. Before dividing, the program
 * checks that the second number is not 0, because a number cannot be
 * divided by zero.
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SIMPLE CALCULATOR");
        System.out.print("Type the first number : ");
        double number1 = scanner.nextDouble();

        System.out.print("Type the second number: ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        double difference = number1 - number2;
        double product = number1 * number2;

        System.out.println();
        System.out.printf("Addition       (a + b) = %.2f%n", sum);
        System.out.printf("Subtraction    (a - b) = %.2f%n", difference);
        System.out.printf("Multiplication (a * b) = %.2f%n", product);

        if (number2 != 0) {
            double quotient = number1 / number2;
            double remainder = number1 % number2;
            System.out.printf("Division       (a / b) = %.2f%n", quotient);
            System.out.printf("Remainder      (a %% b) = %.2f%n", remainder);
        } else {
            System.out.println("Division       (a / b) = not possible, the second number is 0");
            System.out.println("Remainder      (a % b) = not possible, the second number is 0");
        }

        scanner.close();
    }
}
