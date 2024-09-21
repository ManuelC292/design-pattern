public class EcranHdmi implements Hdmi{
    @Override
    public void render(String message) {
        System.out.println("Ecran HDMI !");
        System.out.println(message);
    }
}
