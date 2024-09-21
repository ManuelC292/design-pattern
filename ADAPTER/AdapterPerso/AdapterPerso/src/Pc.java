public class Pc {
    
    private Vga vga;
    public void print(String message){
        System.out.println("****************************");
        vga.print(message);
        System.out.println("****************************");
    }
    public void SetEcranPC(Vga vga){
        this.vga = vga;
    }
    
    
}
