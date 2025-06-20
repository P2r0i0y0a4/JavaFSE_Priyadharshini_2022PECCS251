package exercise2;
public class Search {
    // Linear search implementation
    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product; // Product found
            }
        }
        return null; // Product not found
    }
}
