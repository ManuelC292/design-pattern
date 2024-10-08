package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcret implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private int etat;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(this); // possibilité de pousser la valeur directement à la place de this exemple ici etat
        }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        notifyObserver();
    }
}
