package exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an array of Product objects
        Product[] products = {
            new Product("001", "Laptop", "Electronics"),
            new Product("002", "Smartphone", "Electronics"),
            new Product("003", "Tablet", "Electronics"),
            new Product("004", "Headphones", "Accessories"),
            new Product("005", "Smartwatch", "Wearables")
        };

        // Linear Search
        String searchId = "003";
        Product foundProductLinear = Search.linearSearch(products, searchId);
        System.out.println("Linear Search Result:");
        if (foundProductLinear != null) {
            System.out.println("Found: " + foundProductLinear.getProductName());
        } else {
            System.out.println("Product not found.");
        }

        // Binary Search (requires sorted array)
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
        Product foundProductBinary = BinarySearch.binarySearch(products, searchId);
        System.out.println("Binary Search Result:");
        if (foundProductBinary != null) {
            System.out.println("Found: " + foundProductBinary.getProductName());
        } else {
            System.out.println("Product not found.");
        }
    }
}
