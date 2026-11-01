/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Student Name : Irofuala Daniel
 * Matric Number: 25/17793
 * Programme    : Computer Science
 *
 * Reads the name of an item, the quantity bought and the price of one
 * unit, then calculates the total cost:
 *
 *     total cost = quantity x unit price
 *
 * Quantity is an int because you cannot buy part of an item, while the
 * price is a double because it can have kobo (decimal places).
 */
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of item       : ");
        String itemName = scanner.nextLine();

        System.out.print("Quantity bought    : ");
        int quantity = scanner.nextInt();

        System.out.print("Price per unit (N) : ");
        double unitPrice = scanner.nextDouble();

        System.out.println();
        if (quantity <= 0 || unitPrice < 0) {
            System.out.println("The quantity must be more than 0 and the price cannot be negative.");
        } else {
            double totalCost = quantity * unitPrice;

            System.out.println("--------- BILL ---------");
            System.out.println("Item       : " + itemName);
            System.out.println("Quantity   : " + quantity);
            System.out.printf("Unit Price : %,.2f Naira%n", unitPrice);
            System.out.printf("Total Cost : %,.2f Naira%n", totalCost);
            System.out.println("------------------------");
        }

        scanner.close();
    }
}
