import main.java.computer.*;
import main.java.computer.adapter.HdmiVgaAdapter;

public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir Master II-BDCC Design pattern");


        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("Bonsoir");

    }
}