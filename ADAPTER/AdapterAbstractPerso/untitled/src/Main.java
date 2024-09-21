public class Main {
    public static void main(String[] args) {
        // Cas de base
        ClasseUtilisatrice classeUtilisatrice = new ClasseUtilisatrice();

        ClasseInterfacee classeInterfacee = new ClasseInterfacee();
        classeUtilisatrice.SetClasseInterface(classeInterfacee);

        classeUtilisatrice.show();

        // Cas usant Adapter
        ClasseMauvaiseInterface classeMauvaiseInterface = new ClasseMauvaiseInterface();
        AdapterBVersA adapterBVersA = new AdapterBVersA();
        adapterBVersA.setB(classeMauvaiseInterface);
        classeUtilisatrice.SetClasseInterface(adapterBVersA);

        classeUtilisatrice.show();

    }
}