import bo.ShoppingCart;
import strategy.NoDiscountStrategy;
import strategy.RegularDiscountStrategy;
import strategy.VIPDiscountStrategy;

public class Main {
    public static void main(String[] args) {
        double price = 100.;

        // Utilisation de la stratégie pour un client VIP
        ShoppingCart cart = new ShoppingCart(new VIPDiscountStrategy());
        System.out.println("Prix pour un client VIP: " + cart.calculateTotal(price));

        // Changer dynamiquement la stratégie pour un client régulier
        cart.setDiscountStrategy(new RegularDiscountStrategy());
        System.out.println("Prix pour un client régulier: " + cart.calculateTotal(price));

        // Sans réduction
        cart.setDiscountStrategy(new NoDiscountStrategy());
        System.out.println("Prix sans réduction: " + cart.calculateTotal(price));

    }
}