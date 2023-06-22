package BuilderPattern.Builder.MainMeals;

import BuilderPattern.Builder.Builders.LunchBuilder;

public class MainLunch {

    public static void main(String[] args) {

        LunchBuilder lunchBuilder = new LunchBuilder();
        String lunch = lunchBuilder.addBeans().addRice().addMeat().addPasta().addJuice().build();

        System.out.println("The items you choose for you lunch are: " + lunch);

    }
}
