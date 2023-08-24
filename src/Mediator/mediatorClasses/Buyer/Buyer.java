package Mediator.mediatorClasses.Buyer;

import Mediator.mediator.Mediator;

public class Buyer {
    private Mediator mediator;

    public Buyer(Mediator mediator) {
        this.mediator = mediator;
    }

    public void getProducts() {
        this.mediator.getProducts();
    }

    public void buyProduct(int id) {
        this.mediator.buy(id);
    }
}
