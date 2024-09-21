package bo;

import builder.ComputerBuilder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean hasGraphicsCard;

    public Computer(String CPU, String RAM, String storage, boolean hasGraphicsCard) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.hasGraphicsCard = hasGraphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", hasGraphicsCard=" + hasGraphicsCard + "]";
    }

    public static ComputerBuilder builder(String CPU, String RAM) {
        return new ComputerBuilder(CPU, RAM);
    }
}
