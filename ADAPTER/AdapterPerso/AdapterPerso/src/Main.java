public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pc pc = new Pc();
        EcranVGA ecranVGA = new EcranVGA();
        pc.SetEcranPC(ecranVGA);
        pc.print("TEST");

        AdapterHdmiVga adapterHdmiVga = new AdapterHdmiVga();
        EcranHdmi ecranHdmi = new EcranHdmi();
        adapterHdmiVga.setHdmi(ecranHdmi);
        pc.SetEcranPC(adapterHdmiVga);
        pc.print("Toto");

    }
}