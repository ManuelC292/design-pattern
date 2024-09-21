package builder;

import bo.Computer;

public class ComputerBuilder implements Builder<Computer>{
    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasGraphicsCard;

    // Constructeur avec les paramètres obligatoires
    public ComputerBuilder(String CPU, String RAM) {
        this.CPU = CPU;
        this.RAM = RAM;
    }

    // Méthodes pour ajouter des attributs optionnels
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public ComputerBuilder setGraphicsCard(boolean hasGraphicsCard) {
        this.hasGraphicsCard = hasGraphicsCard;
        return this;
    }

    // Méthode de construction de l'objet final
    @Override
    public Computer build() {
        return new Computer(CPU, RAM, storage, hasGraphicsCard);
    }
}
