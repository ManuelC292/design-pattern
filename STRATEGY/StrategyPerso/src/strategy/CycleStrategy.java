package strategy;

public class CycleStrategy implements RouteStrategy{
    @Override
    public void calculateRoute() {
        System.out.println("Temps de trajet : 15 jours");
    }
}
