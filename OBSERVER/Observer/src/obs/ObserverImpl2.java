package obs;

import obs.Observable;
import obs.ObservableConcret;
import obs.Observer;

public class ObserverImpl2 implements Observer {
    @Override
    public void update(Observable o) {
        int etat = ((ObservableConcret) o).getEtat();
        System.out.println("Observer2 : " + etat*6);
    }
}
