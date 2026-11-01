/*
 * COS 201 - Computer Programming I
 * Week 2 Practice: Student Profile
 *
 * Student Name : Irofuala Daniel
 * Matric Number: 25/17793
 * Programme    : Computer Science
 *
 * Prints my student profile. Each line is built with print(), which
 * keeps the cursor on the same line, followed by println(), which
 * prints the rest and then moves to the next line.
 */
public class StudentProfile {
    public static void main(String[] args) {
        System.out.println("*** STUDENT PROFILE ***");
        System.out.println();

        System.out.print("Full Name      -> ");
        System.out.println("Irofuala Daniel");

        System.out.print("Matric Number  -> ");
        System.out.println("25/17793");

        System.out.print("Programme      -> ");
        System.out.println("Computer Science");

        System.out.print("Course         -> ");
        System.out.print("COS 201, ");
        System.out.println("Computer Programming I");

        System.out.println();
        System.out.println("*** END OF PROFILE ***");
    }
}
