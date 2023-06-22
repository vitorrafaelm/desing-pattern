package BuilderPattern.Builder.Interfaces;

public interface LunchBuilderProtocol {

    LunchBuilderProtocol addBeans();
    LunchBuilderProtocol addJuice();
    LunchBuilderProtocol addMeat();
    LunchBuilderProtocol addPasta();
    LunchBuilderProtocol addRice();
    LunchBuilderProtocol addSoda();
    String build();
}
