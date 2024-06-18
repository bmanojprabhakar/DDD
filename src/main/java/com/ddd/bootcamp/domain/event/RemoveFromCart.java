package java.com.ddd.bootcamp.domain.event;

public class RemoveFromCart implements DomainEvent {
    private final String productName;

    public RemoveFromCart(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
