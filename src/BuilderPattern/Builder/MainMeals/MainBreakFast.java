package BuilderPattern.Builder.MainMeals;

import BuilderPattern.Builder.Builders.BreakFastBuilder;

public class MainBreakFast {

    public static void main(String[] args) {

        BreakFastBuilder breakFastBuilder = new BreakFastBuilder();

        String breakFast = breakFastBuilder.addBread().addBacon().addEggs().addMilk().build();
        System.out.println("The items you choose for you breakfast are: " + breakFast);
    }
}
