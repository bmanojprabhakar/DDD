package java.com.ddd.bootcamp.domain.event;

import java.com.ddd.bootcamp.domain.Price;

public class AddToCart implements DomainEvent {
    private String productName;
    private int quantity;
    private Price price;

    public AddToCart(String productName, int quantity, Price price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public Price getPrice() {
        return price;
    }
}
