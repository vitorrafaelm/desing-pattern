package BuilderPattern.CompositePattern.mealsByType.lunch;

import BuilderPattern.CompositePattern.abstractMeals.AbstractDinner;
import BuilderPattern.CompositePattern.abstractMeals.AbstractLunch;

public class Beans extends AbstractLunch {
    public Beans(String name, Float price) {
        super(name, price);
    }
}
