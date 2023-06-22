package BuilderPattern.CompositePattern.MealsBoxes;

import BuilderPattern.CompositePattern.interfaces.BreakFastCompositeProtocol;
import BuilderPattern.CompositePattern.interfaces.LunchCompositeProtocol;

import java.util.ArrayList;
import java.util.List;

public class BreakfastBox implements BreakFastCompositeProtocol {
    private List<BreakFastCompositeProtocol> _children = new ArrayList<BreakFastCompositeProtocol>();

    @Override
    public Float getPrice() {
        return null;
    }

    public void add(BreakFastCompositeProtocol lunchItem) {
        this._children.add(lunchItem);
    }

    @Override
    public String toString() {
        List<String> mealsNames = new ArrayList<String>();

        for (BreakFastCompositeProtocol children: _children
             ) {
            mealsNames.add(children.toString());
        }

        return mealsNames.toString();
    }
}
