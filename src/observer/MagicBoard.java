package observer;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private List<Observer> observers;

    public MagicBoard() {
        this.observers = new ArrayList<>();
    }

    public void writeDoll() {
        System.out.println("Santa Claus Needs A Doll");
        this.notifyObservers();
    }

    public void writeBike() {
        System.out.println("Santa Claus Needs A Bike");
        this.notifyObservers();
    }



    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);

    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

    }
}
