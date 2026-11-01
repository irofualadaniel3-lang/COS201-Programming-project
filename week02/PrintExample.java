/*
 * COS 201 - Computer Programming I
 * Week 2 Practice Exercise: print() and println()
 *
 * Student Name: Irofuala Daniel
 *
 * What I expected before running it:
 * The first statement uses print(), so after "COS " the cursor does not
 * move to a new line, and "201" appears straight after it on the same
 * line. println("201") ends that line, so "Java" goes on the next line:
 *
 *     COS 201
 *     Java
 *
 * When I ran the program, the output was exactly what I expected.
 */
public class PrintExample {
    public static void main(String[] args) {
        System.out.print("COS ");
        System.out.println("201");
        System.out.println("Java");
    }
}
