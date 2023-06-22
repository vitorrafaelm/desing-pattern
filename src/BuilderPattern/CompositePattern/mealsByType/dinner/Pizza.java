package BuilderPattern.CompositePattern.mealsByType.dinner;

import BuilderPattern.CompositePattern.abstractMeals.AbstractDinner;

public class Pizza extends AbstractDinner {
    public Pizza(String name, Float price) {
        super(name, price);
    }
}
