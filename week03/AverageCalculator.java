/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Student Name : Irofuala Daniel
 * Matric Number: 25/17793
 * Programme    : Computer Science
 *
 * Reads a student's name and three scores, then works out the total
 * and the average of the scores.
 *
 * Extension exercise: each score has to be between 0 and 100. The
 * program stores the result of that check in a boolean variable, and
 * only calculates the average if all three scores are valid.
 */
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = scanner.nextLine();

        System.out.print("Score 1: ");
        double score1 = scanner.nextDouble();

        System.out.print("Score 2: ");
        double score2 = scanner.nextDouble();

        System.out.print("Score 3: ");
        double score3 = scanner.nextDouble();

        // true only when every score is in the range 0 to 100
        boolean scoresAreValid = score1 >= 0 && score1 <= 100
                && score2 >= 0 && score2 <= 100
                && score3 >= 0 && score3 <= 100;

        System.out.println();
        if (scoresAreValid) {
            double total = score1 + score2 + score3;
            double average = total / 3;

            System.out.println("Name    : " + name);
            System.out.printf("Scores  : %.1f, %.1f, %.1f%n", score1, score2, score3);
            System.out.printf("Total   : %.2f%n", total);
            System.out.printf("Average : %.2f%n", average);
        } else {
            System.out.println("Invalid score entered. Each score must be between 0 and 100.");
            System.out.println("The average was not calculated.");
        }

        scanner.close();
    }
}
