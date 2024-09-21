package composant;

public class Deca extends Boisson{
    protected String description;
    public Deca(){
        this.description = "Deca";
    }
    public String getDescription(){
        return description;
    }

    @Override
    public double cout() {
        return 8;
    }
}
