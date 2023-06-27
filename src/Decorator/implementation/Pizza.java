package Decorator.implementation;

import Decorator.interfaces.MealsItemsProtocol;

public class Pizza implements MealsItemsProtocol {

    private String name;
    private Float price;

    public Pizza(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Float getPrice() {
        return this.price;
    }
}
