/*
 * COS 201 - Computer Programming I
 * Week 2 Exercise: Find and Fix the Error
 *
 * Student Name: Irofuala Daniel
 *
 * The line given in the exercise was:
 *     System.out.println("Learning Java")
 *
 * Compiling it gave the error "';' expected". The statement had no
 * semicolon at the end, and in Java every statement must finish with
 * one. After I added the semicolon, the program compiled and printed
 * "Learning Java".
 */
public class ErrorExample {
    public static void main(String[] args) {
        System.out.println("Learning Java");
    }
}
