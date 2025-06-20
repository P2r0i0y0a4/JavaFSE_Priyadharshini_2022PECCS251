package exercise2;
import java.util.Arrays;

public class BinarySearch {
    // Binary search implementation
    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId().equals(productId)) {
                return products[mid]; // Product found
            }
            if (products[mid].getProductId().compareTo(productId) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return null; // Product not found
    }
}
