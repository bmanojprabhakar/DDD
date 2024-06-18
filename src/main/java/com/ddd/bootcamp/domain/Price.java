package java.com.ddd.bootcamp.domain;

import java.util.Currency;

public class Price {
    private final double value;
    private final Currency currency;

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public Price discount(int percentage) {
        return new Price(value - ((value*percentage)/100), Currency.getInstance("USD"));
    }
}
