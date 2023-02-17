public class PriceCalculator {

    public Price getDiscountedPrice(Product competitorsProduct){
        double newPrice = competitorsProduct.getPrice().getValue() * 0.1;
        return new Price(newPrice,competitorsProduct.getPrice().getCurrency());
    }
}
