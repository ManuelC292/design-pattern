public class AdapterBVersA implements A{
    private B b;

    public void setB(B b){
        this.b = b;
    }

    @Override
    public void show() {
        System.out.println("AdapterBVersA");
        b.render();
    }
}
