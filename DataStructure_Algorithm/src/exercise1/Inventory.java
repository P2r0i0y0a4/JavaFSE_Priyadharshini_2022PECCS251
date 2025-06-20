package exercise1;
import java.util.HashMap;

public class Inventory {
    HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }
    // Add a product
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(String productId, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        products.remove(productId);
    }

    
}
