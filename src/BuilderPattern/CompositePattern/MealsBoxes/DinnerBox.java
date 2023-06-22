package BuilderPattern.CompositePattern.MealsBoxes;

import BuilderPattern.CompositePattern.interfaces.BreakFastCompositeProtocol;
import BuilderPattern.CompositePattern.interfaces.DinnerCompositeProtocol;
import BuilderPattern.CompositePattern.interfaces.LunchCompositeProtocol;

import java.util.ArrayList;
import java.util.List;

public class DinnerBox implements DinnerCompositeProtocol {
    private List<DinnerCompositeProtocol> _children = new ArrayList<DinnerCompositeProtocol>();

    @Override
    public Float getPrice() {
        return null;
    }

    public void add(DinnerCompositeProtocol lunchesItems) {
            this._children.add(lunchesItems);
    }

    @Override
    public String toString() {
        List<String> mealsNames = new ArrayList<String>();

        for (DinnerCompositeProtocol children: _children
        ) {
            mealsNames.add(children.toString());
        }

        return mealsNames.toString();
    }
}
