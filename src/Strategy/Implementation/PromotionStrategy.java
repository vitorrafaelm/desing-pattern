package Strategy.Implementation;

import Strategy.Interfaces.Cart;

public class PromotionStrategy<T> {
    protected double discount = 0;

    public double getDiscount(Cart<T> cart) {
        return cart.getTotal();
    }
}
