package BuilderPattern.CompositePattern.mealsByType.breakfast;

import BuilderPattern.CompositePattern.abstractMeals.AbstractBreakFast;

public class Coffee extends AbstractBreakFast {
    public Coffee(String name, Float price) {
        super(name, price);
    }
}
