import java.util.Map;
import java.util.Scanner;
import com.Menu;
import com.Order;
import com.Bill;

public class OrderingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
        menu.addItem("Burger", 8.99);
        menu.addItem("French Fries", 4.00);
        menu.addItem("Pizza", 10.99);
        menu.addItem("Salad", 6.99);
        menu.addItem("Steak", 19.89);
        menu.addItem("Coca-Cola", 1.50);
        menu.addItem("Sprite", 1.50);

        Order order = new Order();

        System.out.println("Welcome to our restaurant! Please select your order type:");
        System.out.println("1. Dine-in");
        System.out.println("2. Take away");
        System.out.println("3. Delivery");
        System.out.print("Enter choice: ");

        String input = scanner.nextLine().toLowerCase();
        int orderType;

        switch (input) {
            case "1":
            case "dine-in":
            case "Dine in":
            case "dine in":
            case "Dine In":
            case "Dine-In":
            case "dine In":
            case "DINE IN":
                orderType = 1;
                break;
            case "2":
            case "take away":
            case "takeaway":
            case "Takeaway":
                orderType = 2;
                break;
            case "3":
            case "delivery":
            case "Delivery":
                orderType = 3;
                break;
            default:
                System.out.println("Invalid order type.");
                scanner.close();
                return;
}


        if (orderType < 1 || orderType > 3) {
            System.out.println("Invalid order type.");
            scanner.close();
            return;
        }

        if (orderType == 3) {
            System.out.print("Enter delivery location: ");
            order.setDeliveryLocation(scanner.nextLine());

            System.out.print("Enter pickup branch: ");
            order.setPickupBranch(scanner.nextLine());

            order.addDeliveryFee(5.00);
        }

        System.out.println("\n╔══════════════════════════╗");
        System.out.println("║        OUR MENU          ║");
        System.out.println("╠══════════════════════════╣");
        for (Map.Entry<String, Double> entry : menu.getItems().entrySet()) {
            System.out.println(" " + entry.getKey() + " - $" + entry.getValue());
        }
        System.out.println("╚══════════════════════════╝");

        boolean ordering = true;

        while (ordering) {
            System.out.print("Enter item name: ");
            String item = scanner.nextLine();

            while (!menu.getItems().containsKey(item)) {
                System.out.print("Invalid item. Enter again: ");
                item = scanner.nextLine();
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            order.addItem(item, quantity);

            System.out.print("Order more? (yes/no): ");
            ordering = scanner.nextLine().equalsIgnoreCase("yes");
        }

        Bill.printReceipt(order, menu);
        double total = Bill.calculateTotal(order, menu);
        Bill.processPayment(total, scanner);


        scanner.close();
    }
}
