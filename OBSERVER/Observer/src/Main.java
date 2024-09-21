import obs.ObservableConcret;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Main {
    public static void main(String[] args) {

        ObservableConcret sujet = new ObservableConcret();
        ObserverImpl1 observerImpl1 = new ObserverImpl1();
        sujet.addObserver(observerImpl1);
        ObserverImpl2 observerImpl2 = new ObserverImpl2();
        sujet.addObserver(observerImpl2);
        sujet.setEtat(8);
        sujet.setEtat(7);
        sujet.deleteObserver(observerImpl1);
        sujet.setEtat(9);

    }
}