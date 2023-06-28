package Facade;

import BuilderPattern.Builder.Builders.BreakFastBuilder;
import BuilderPattern.Builder.Builders.DinnerBuilder;
import BuilderPattern.Builder.Builders.LunchBuilder;

public class BuilderFacade {
    private BreakFastBuilder breakFastBuilder = new BreakFastBuilder();
    private DinnerBuilder dinnerBuilder = new DinnerBuilder();
    private LunchBuilder lunchBuilder = new LunchBuilder();

    public String createBreakfast() {
        String breakFast = breakFastBuilder.addBread().addBacon().addEggs().addMilk().build();
        return "The items you choose for you breakfast are: " + breakFast;
    }

    public String createDinner() {
        String dinner = dinnerBuilder.addPizza().addSoda().addJuice().addSandwhich().build();
        return "The items you choose for you lunch are: " + dinner;
    }

    public String createLunch() {
        String lunch = lunchBuilder.addBeans().addRice().addMeat().addPasta().addJuice().build();
        return "The items you choose for you lunch are: " + lunch;
    }
}
