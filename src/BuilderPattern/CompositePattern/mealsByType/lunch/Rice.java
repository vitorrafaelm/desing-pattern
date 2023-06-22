package BuilderPattern.CompositePattern.mealsByType.lunch;

import BuilderPattern.CompositePattern.abstractMeals.AbstractLunch;

public class Rice extends AbstractLunch {
    public Rice(String name, Float price) {
        super(name, price);
    }
}
