package strategy;

public class VIPDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price*0.8;
    }
}
