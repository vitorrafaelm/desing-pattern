package BuilderPattern.CompositePattern.abstractMeals;

import BuilderPattern.CompositePattern.interfaces.BreakFastCompositeProtocol;

public abstract class AbstractBreakFast implements BreakFastCompositeProtocol {
    private String name;
    private Float price;

    public AbstractBreakFast(String name, Float price) {
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
