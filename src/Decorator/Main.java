package Decorator;

import Decorator.decorators.PepperoniDecorator;
import Decorator.implementation.Pizza;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("Pizza", 20.00F);
        PepperoniDecorator pepperoniDecorator = new PepperoniDecorator(pizza);
        System.out.println("---------------------- Normal Pizza ----------------------");
        System.out.println(pizza.getName());
        System.out.println(pizza.getPrice());

        System.out.println("---------------------- Pepperoni Pizza ----------------------");
        System.out.println(pepperoniDecorator.getName());
        System.out.println(pepperoniDecorator.getPrice());
    }
}
