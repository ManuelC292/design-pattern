package decorateur;

import composant.Boisson;

public class Chantilly extends Decorateur{

    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " avec de la Chantilly";
    }

    @Override
    public double cout() {
        return boisson.cout() + 0.5;
    }
}
