package java.com.ddd.bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart implements Entity<Cart> {
    private final String cartId = UUID.randomUUID().toString();;
    private List<Product> products = new ArrayList<>();

    public List<Product> removeProduct(List<Product> products, String name) {
        for(int i=0;i<products.size();i++) {
            products.remove(name);
        }
        return products;
    }

    public String getCartId() {
        return cartId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean hasSameEntityAs(Cart cart) {
        if(this == cart)
            return true;
        if(cart == null || getClass()!=cart.getClass())
            return false;
        return cartI

    }
}
