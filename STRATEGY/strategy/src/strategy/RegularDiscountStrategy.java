package strategy;

public class RegularDiscountStrategy implements DiscountStrategy{
    @Override
    public double applyDiscount(double price) {
        return price*0.9;
    }
}
