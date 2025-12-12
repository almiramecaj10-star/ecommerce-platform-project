package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private User user;
    private List<Product> products;

    public ShoppingCart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("User: " + user.getName());
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("- " + p.getName());
        }
        System.out.println("Total: " + calculateTotal() + " €");
    }
}
