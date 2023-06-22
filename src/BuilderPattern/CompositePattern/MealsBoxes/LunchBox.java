package BuilderPattern.CompositePattern.MealsBoxes;

import BuilderPattern.CompositePattern.interfaces.LunchCompositeProtocol;

import java.util.ArrayList;
import java.util.List;

public class LunchBox implements LunchCompositeProtocol {
    private List<LunchCompositeProtocol> _children = new ArrayList<LunchCompositeProtocol>();

    @Override
    public Float getPrice() {
        return null;
    }

    public void add(LunchCompositeProtocol lunchesItems) {
        this._children.add(lunchesItems);
    }

    @Override
    public String toString() {
        List<String> mealsNames = new ArrayList<String>();

        for (LunchCompositeProtocol children: _children
        ) {
            mealsNames.add(children.toString());
        }

        return mealsNames.toString();
    }
}
