public class ClasseUtilisatrice implements A{

    private A a;
    void SetClasseInterface(A a){
        this.a = a;
    }

    @Override
    public void show() {
        System.out.println("Classe Utilisatrice");
    }
}
