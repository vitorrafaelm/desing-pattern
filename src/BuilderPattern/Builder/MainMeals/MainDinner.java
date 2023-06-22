package BuilderPattern.Builder.MainMeals;

import BuilderPattern.Builder.Builders.DinnerBuilder;

public class MainDinner {

    public static void main(String[] args) {

        DinnerBuilder dinnerBuilder = new DinnerBuilder();
        String dinner = dinnerBuilder.addPizza().addSoda().addJuice().addSandwhich().build();

        System.out.println("The items you choose for you lunch are: " + dinner);
    }
}
