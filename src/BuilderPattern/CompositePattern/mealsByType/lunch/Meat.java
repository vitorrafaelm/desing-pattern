package BuilderPattern.CompositePattern.mealsByType.lunch;

import BuilderPattern.CompositePattern.abstractMeals.AbstractLunch;

public class Meat extends AbstractLunch {
    public Meat(String name, Float price) {
        super(name, price);
    }
}
