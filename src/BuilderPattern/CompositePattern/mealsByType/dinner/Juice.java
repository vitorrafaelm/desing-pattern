package BuilderPattern.CompositePattern.mealsByType.dinner;

import BuilderPattern.CompositePattern.abstractMeals.AbstractBreakFast;
import BuilderPattern.CompositePattern.abstractMeals.AbstractDinner;

public class Juice extends AbstractDinner {
    public Juice(String name, Float price) {
        super(name, price);
    }
}
