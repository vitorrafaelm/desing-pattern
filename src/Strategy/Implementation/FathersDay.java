package Strategy.Implementation;

import Strategy.Interfaces.Cart;

public class FathersDay extends PromotionStrategy<Cart> {
    protected double discount = 10;

    @Override
    public double getDiscount(Cart cart) {
        double total = cart.getTotal();
        return total - total * (this.discount / 100);
    }
}
