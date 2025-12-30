package com;

import java.util.Map;
import java.util.Scanner;

public class Bill {

    public static double calculateTotal(Order order, Menu menu) {
        double total = 0.0;

        for (Map.Entry<String, Integer> entry : order.getItems().entrySet()) {
            total += menu.getPrice(entry.getKey()) * entry.getValue();
        }

        total += order.getDeliveryFee();
        return total;
    }

    public static void printReceipt(Order order, Menu menu) {
        System.out.println("\n========== RECEIPT ==========");
        System.out.printf("%-15s %-10s %-10s %-10s%n",
                "Item", "Qty", "Price", "Subtotal");
        System.out.println("----------------------------------------");

        for (Map.Entry<String, Integer> entry : order.getItems().entrySet()) {
            String item = entry.getKey();
            int qty = entry.getValue();
            double price = menu.getPrice(item);
            double subtotal = price * qty;

            System.out.printf("%-15s %-10d $%-9.2f $%-9.2f%n",
                    item, qty, price, subtotal);
        }

        if (order.getDeliveryFee() > 0) {
            System.out.println("----------------------------------------");
            System.out.printf("%-37s $%-9.2f%n",
                    "Delivery Fee:", order.getDeliveryFee());
        }

        System.out.println("----------------------------------------");
        System.out.printf("%-37s $%-9.2f%n",
                "TOTAL:", calculateTotal(order, menu));
        System.out.println("========================================");
    }

    public static void processPayment(double total, Scanner scanner) {
    double remaining = total;
    double paid = 0;

    while (remaining > 0) {
        System.out.print("Enter payment amount: ");
        String input = scanner.nextLine().replace("$", "").trim();

        double payment;
        try {
            payment = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            continue;
        }

        paid += payment;
        remaining -= payment;

        if (remaining > 0) {
            System.out.printf("Remaining balance: $%.2f%n", remaining);
        }
    }

    System.out.println("Payment successful!");
    System.out.printf("Change: $%.2f%n", paid - total);
}

}
