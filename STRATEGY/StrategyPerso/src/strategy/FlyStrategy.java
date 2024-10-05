package strategy;

public class FlyStrategy implements RouteStrategy{
    @Override
    public void calculateRoute() {
        System.out.println("Temps de trajet : 1h");
    }
}
