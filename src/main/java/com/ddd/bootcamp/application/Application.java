package java.com.ddd.bootcamp.application;

import java.com.ddd.bootcamp.domain.Cart;
import java.com.ddd.bootcamp.domain.Product;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        List<Product> products = new ArrayList<>();
        Product product1 = new Product();
        product1.setName("Apple Pencil");
        product1.setQuantity(2);
        products.add(product1);

        Product product2 = new Product();
        product2.setName("Sony wireless Headphone");
        product2.setQuantity(1);
        products.add(product2);
        cart.setProducts(products);
    }
}
