package BuilderPattern.CompositePattern.abstractMeals;

import BuilderPattern.CompositePattern.interfaces.LunchCompositeProtocol;

public abstract class AbstractLunch implements LunchCompositeProtocol {

    private String name;
    private Float price;

    public AbstractLunch(String name, Float price) {
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
