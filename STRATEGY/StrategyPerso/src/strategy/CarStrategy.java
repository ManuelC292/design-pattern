package strategy;

public class CarStrategy implements RouteStrategy{
    @Override
    public void calculateRoute() {
        System.out.println("Temps de trajet : 5h");
    }
}
