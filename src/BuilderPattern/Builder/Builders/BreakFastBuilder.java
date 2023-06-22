package BuilderPattern.Builder.Builders;

import BuilderPattern.Builder.Interfaces.BreakfastBuilderProtocol;
import BuilderPattern.CompositePattern.MealsBoxes.BreakfastBox;
import BuilderPattern.CompositePattern.mealsByType.breakfast.*;

public class BreakFastBuilder implements BreakfastBuilderProtocol {
    private BreakfastBox _meal = new BreakfastBox();
    @Override
    public BreakfastBuilderProtocol addBacon() {
        Bacon bacon = new Bacon("Bacon", 5.5F);
        this._meal.add(bacon);
        return this;
    }

    @Override
    public BreakfastBuilderProtocol addBread() {
        Bread bread = new Bread("Bread", 1F);
        this._meal.add(bread);
        return this;
    }

    @Override
    public BreakfastBuilderProtocol addCoffee() {
        Coffee coffee = new Coffee("Coffee", 1F);
        this._meal.add(coffee);
        return this;
    }

    @Override
    public BreakfastBuilderProtocol addEggs() {
        Eggs egg = new Eggs("Egg", 1F);
        this._meal.add(egg);
        return this;
    }

    @Override
    public BreakfastBuilderProtocol addMilk() {
        Milk milk = new Milk("Milk", 3F);
        this._meal.add(milk);
        return this;
    }

    @Override
    public BreakfastBuilderProtocol addTapioca() {
        Tapioca tapioca = new Tapioca("Tapioca", 3F);
        this._meal.add(tapioca);
        return this;
    }

    @Override
    public String build() {
        return _meal.toString();
    }
}
