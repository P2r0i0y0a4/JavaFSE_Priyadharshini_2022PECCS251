package exercise1;

public class Main {
    public static void main(String[] args) {
        // Create an inventory instance
        Inventory inventory = new Inventory();

        // Create some products
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        // Add products to inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display products
        System.out.println("Products in inventory after addition:");
        displayInventory(inventory);

        // Update a product
        inventory.updateProduct("P001", 8, 949.99); // Update Laptop quantity and price

        // Display products after update
        System.out.println("\nProducts in inventory after update:");
        displayInventory(inventory);

        // Delete a product
        inventory.deleteProduct("P002"); // Remove Smartphone

        // Display products after deletion
        System.out.println("\nProducts in inventory after deletion:");
        displayInventory(inventory);
    }

    private static void displayInventory(Inventory inventory) {
        for (Product product : inventory.products.values()) {
            System.out.println("ID: " + product.getProductId() +
                               ", Name: " + product.getProductName() +
                               ", Quantity: " + product.getQuantity() +
                               ", Price: $" + product.getPrice());
        }
    }
}
