package Decorator.decorators;

import Decorator.interfaces.MealsItemsProtocol;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(MealsItemsProtocol Pizza) {
        super(Pizza);
    }

    @Override
    public String getName() {
        return this.pizza.getName() + " Pepperoni";
    }

    @Override
    public Float getPrice() {
        return this.pizza.getPrice() + 10;
    }
}
