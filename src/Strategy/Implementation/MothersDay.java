package Strategy.Implementation;

import Strategy.Interfaces.Cart;

public class MothersDay extends PromotionStrategy {
    protected double discount = 20;

    @Override
    public double getDiscount(Cart cart) {
        double total = cart.getTotal();

        return total - total * (this.discount / 100);
    }
}
