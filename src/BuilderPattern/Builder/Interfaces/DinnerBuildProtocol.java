package BuilderPattern.Builder.Interfaces;

public interface DinnerBuildProtocol {
    DinnerBuildProtocol addJuice();
    DinnerBuildProtocol addLasagna();
    DinnerBuildProtocol addPancakes();
    DinnerBuildProtocol addPizza();
    DinnerBuildProtocol addSandwhich();
    DinnerBuildProtocol addSoda();
    String build();
}
