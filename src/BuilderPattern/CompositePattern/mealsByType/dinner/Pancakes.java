package BuilderPattern.CompositePattern.mealsByType.dinner;

import BuilderPattern.CompositePattern.abstractMeals.AbstractDinner;

public class Pancakes extends AbstractDinner {
    public Pancakes(String name, Float price) {
        super(name, price);
    }
}
