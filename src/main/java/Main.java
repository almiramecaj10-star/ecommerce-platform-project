package ecommerce;

public class Main {
    public static void main(String[] args) {

        User user = new User("Almira", "almira@email.com");

        Product p1 = new Product(1, "Laptop", 1200.0);
        Product p2 = new Product(2, "Mouse", 25.0);

        ShoppingCart cart = new ShoppingCart(user);
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.printReceipt();
    }
}
