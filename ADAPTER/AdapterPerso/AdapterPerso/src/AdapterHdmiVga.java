public class AdapterHdmiVga implements Vga {

    Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println(" -> Adapter");
        System.out.println(message);
    }

    public void setHdmi(Hdmi hdmi){
        this.hdmi = hdmi;
    }
}
