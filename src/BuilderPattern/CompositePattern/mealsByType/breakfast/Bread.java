package BuilderPattern.CompositePattern.mealsByType.breakfast;

import BuilderPattern.CompositePattern.abstractMeals.AbstractBreakFast;

public class Bread extends AbstractBreakFast {
    public Bread(String name, Float price) {
        super(name, price);
    }
}
