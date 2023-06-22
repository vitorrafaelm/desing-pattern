package BuilderPattern.CompositePattern.mealsByType.breakfast;

import BuilderPattern.CompositePattern.abstractMeals.AbstractBreakFast;

public class Eggs extends AbstractBreakFast {
    public Eggs(String name, Float price) {
        super(name, price);
    }
}
