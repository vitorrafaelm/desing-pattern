package BuilderPattern.Builder.Interfaces;

public interface BreakfastBuilderProtocol {
    BreakfastBuilderProtocol addBacon();
    BreakfastBuilderProtocol addBread();
    BreakfastBuilderProtocol addCoffee();
    BreakfastBuilderProtocol addEggs();
    BreakfastBuilderProtocol addMilk();
    BreakfastBuilderProtocol addTapioca();
    String build();
}
