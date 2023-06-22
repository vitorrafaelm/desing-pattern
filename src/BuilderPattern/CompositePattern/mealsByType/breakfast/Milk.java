package BuilderPattern.CompositePattern.mealsByType.breakfast;

import BuilderPattern.CompositePattern.abstractMeals.AbstractBreakFast;

public class Milk extends AbstractBreakFast {
    public Milk(String name, Float price) {
        super(name, price);
    }
}
