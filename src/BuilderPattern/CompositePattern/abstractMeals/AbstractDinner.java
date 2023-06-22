package BuilderPattern.CompositePattern.abstractMeals;

import BuilderPattern.CompositePattern.interfaces.DinnerCompositeProtocol;

public abstract class AbstractDinner implements DinnerCompositeProtocol {
    private String name;
    private Float price;

    public AbstractDinner(String name, Float price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public Float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return  this.name;
    }
}
