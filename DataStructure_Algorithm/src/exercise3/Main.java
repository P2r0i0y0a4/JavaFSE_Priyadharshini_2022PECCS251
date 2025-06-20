package exercise3;
public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("001", "Alice", 250.75),
            new Order("002", "Bob", 150.50),
            new Order("003", "Charlie", 300.00),
            new Order("004", "David", 100.25),
            new Order("005", "Eve", 200.00)
        };

        System.out.println("Original Orders:");
        displayOrders(orders);

        // Bubble Sort
        Order[] bubbleSorted = orders.clone();
        BubbleSort.bubbleSort(bubbleSorted);
        System.out.println("\nBubble Sorted Orders:");
        displayOrders(bubbleSorted);

        // Quick Sort
        Order[] quickSorted = orders.clone();
        OrderSorter.quickSort(quickSorted);
        System.out.println("\nQuick Sorted Orders:");
        displayOrders(quickSorted);
    }

    public static void displayOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.printf("ID: %s, Customer: %-8s, Price: $%.2f%n",
                            order.getOrderId(),
                            order.getCustomerName(),
                            order.getTotalPrice());
        }
    }
}
