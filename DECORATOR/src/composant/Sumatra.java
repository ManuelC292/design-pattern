package composant;

public class Sumatra extends Boisson{

    protected String description;
    public Sumatra(){
        description = "Sumatra";
    }

    public String getDescription(){
        return description;
    }

    @Override
    public double cout() {
        return 6;
    }
}
