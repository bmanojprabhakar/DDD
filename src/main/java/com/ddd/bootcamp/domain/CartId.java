package java.com.ddd.bootcamp.domain;

import java.util.UUID;

public class CartId {
    private UUID randomId;

    public double generateRandomId() {
        return UUID.randomUUID();
    }
}
