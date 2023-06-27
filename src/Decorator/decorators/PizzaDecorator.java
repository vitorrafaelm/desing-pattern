package Decorator.decorators;

import Decorator.interfaces.MealsItemsProtocol;

public class PizzaDecorator implements MealsItemsProtocol {
    MealsItemsProtocol pizza;
    public PizzaDecorator(MealsItemsProtocol Pizza) {
        this.pizza = Pizza;
    }
    @Override
    public String getName() {
        return this.pizza.getName();
    }

    @Override
    public Float getPrice() {
        return this.pizza.getPrice();
    }
}
