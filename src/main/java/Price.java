import java.util.Currency;

public class Price {

    private final double value;
    private final Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }
}
