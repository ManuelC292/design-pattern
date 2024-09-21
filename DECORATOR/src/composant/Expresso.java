package composant;

public class Expresso extends Boisson{
    protected String description;
    public Expresso(){
        description = "Expresso";
    }

    public String getDescription(){
        return description;
    }

    @Override
    public double cout() {
        return 12;
    }
}
