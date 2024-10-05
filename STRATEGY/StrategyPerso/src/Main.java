import strategy.CarStrategy;
import strategy.CycleStrategy;
import strategy.RouteStrategy;

public class Main {
    public static void main(String[] args) {

        RouteStrategy strategy = new CycleStrategy();
        strategy.calculateRoute();

        strategy = new CarStrategy();
        strategy.calculateRoute();

        strategy = new CycleStrategy();
        strategy.calculateRoute();

    }
}