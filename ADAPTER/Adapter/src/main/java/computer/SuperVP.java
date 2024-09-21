package main.java.computer;

public class SuperVP implements Vga, Hdmi{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("...............SUPER VP HDMI.......................");
        System.out.println(message);
        System.out.println("...............SUPER VP HDMI.......................");
    }

    @Override
    public void print(String message) {
        System.out.println("...............SUPER VP VGA.......................");
        System.out.println(message);
        System.out.println("...............SUPER VP VGA.......................");
    }
}
