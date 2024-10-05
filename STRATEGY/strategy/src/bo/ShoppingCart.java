package bo;

import strategy.DiscountStrategy;

public class ShoppingCart {
    private DiscountStrategy discountStrategy;

    public ShoppingCart(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal(double price){
        return discountStrategy.applyDiscount(price);
    }

}
