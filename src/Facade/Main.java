package Facade;

public class Main {

    public static void main(String[] args) {
        BuilderFacade builderFacade = new BuilderFacade();

        System.out.println(builderFacade.createBreakfast());
        System.out.println(builderFacade.createLunch());
        System.out.println(builderFacade.createDinner());
    }

}
