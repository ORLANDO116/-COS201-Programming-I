import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n--- ITEM COST DETAILS ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: %.2f%n", unitPrice);
        System.out.printf("Total Cost: %.2f%n", totalCost);

        input.close();
    }
}
