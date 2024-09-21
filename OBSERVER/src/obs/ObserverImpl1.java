package obs;

import obs.Observable;
import obs.ObservableConcret;
import obs.Observer;

public class ObserverImpl1  implements Observer {
    @Override
    public void update(Observable o) {
        int etat = ((ObservableConcret) o).getEtat(); // si update poussait la valeur d'état cette ligne deviendrait obsolète
        System.out.println("Observer 1 : " + etat*3);
    }
}
