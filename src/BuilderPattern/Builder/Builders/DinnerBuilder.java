package BuilderPattern.Builder.Builders;

import BuilderPattern.Builder.Interfaces.DinnerBuildProtocol;
import BuilderPattern.CompositePattern.MealsBoxes.DinnerBox;
import BuilderPattern.CompositePattern.mealsByType.dinner.*;

public class DinnerBuilder implements DinnerBuildProtocol {
    private DinnerBox _meal = new DinnerBox();
    @Override
    public DinnerBuildProtocol addJuice() {
        Juice juice = new Juice("Juice", 5.5F);
        this._meal.add(juice);
        return this;
    }

    @Override
    public DinnerBuildProtocol addLasagna() {
        Lasagna lasagna = new Lasagna("Lasagna", 5.5F);
        this._meal.add(lasagna);
        return this;
    }

    @Override
    public DinnerBuildProtocol addPancakes() {
        Pancakes pancakes = new Pancakes("Pancakes", 5.5F);
        this._meal.add(pancakes);
        return this;
    }

    @Override
    public DinnerBuildProtocol addPizza() {
        Pizza pizza = new Pizza("Pizza", 5.5F);
        this._meal.add(pizza);
        return this;
    }

    @Override
    public DinnerBuildProtocol addSandwhich() {
        Sandwhich sandwhich = new Sandwhich("Sandwhich", 5.5F);
        this._meal.add(sandwhich);
        return this;
    }

    @Override
    public DinnerBuildProtocol addSoda() {
        Soda soda = new Soda("Soda", 5.5F);
        this._meal.add(soda);
        return this;
    }

    @Override
    public String build() {
        return this._meal.toString();
    }
}
