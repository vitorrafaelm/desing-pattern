package BuilderPattern.Builder.Builders;

import BuilderPattern.Builder.Interfaces.LunchBuilderProtocol;
import BuilderPattern.CompositePattern.MealsBoxes.LunchBox;
import BuilderPattern.CompositePattern.mealsByType.lunch.*;

public class LunchBuilder implements LunchBuilderProtocol {

    private LunchBox _meal = new LunchBox();
    @Override
    public LunchBuilderProtocol addBeans() {
        Beans beans = new Beans("Beans", 7F);
        this._meal.add(beans);
        return this;
    }

    @Override
    public LunchBuilderProtocol addJuice() {
        Juice juice = new Juice("Juice", 1F);
        this._meal.add(juice);
        return this;
    }

    @Override
    public LunchBuilderProtocol addMeat() {
        Meat meat = new Meat("Meat", 1F);
        this._meal.add(meat);
        return this;
    }

    @Override
    public LunchBuilderProtocol addPasta() {
        Pasta pasta = new Pasta("Pasta", 1F);
        this._meal.add(pasta);
        return this;
    }

    @Override
    public LunchBuilderProtocol addRice() {
        Rice rice = new Rice("Rice", 1F);
        this._meal.add(rice);
        return this;
    }

    @Override
    public LunchBuilderProtocol addSoda() {
        Soda soda = new Soda("Soda", 1F);
        this._meal.add(soda);
        return this;
    }

    @Override
    public String build() {
        return this._meal.toString();
    }
}
