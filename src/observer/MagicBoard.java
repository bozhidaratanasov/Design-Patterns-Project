package observer;

import java.util.ArrayList;
import java.util.List;

public class MagicBoard implements Observable {

    private List<Observer> observers;
    private String toy;

    public MagicBoard() {
        this.observers = new ArrayList<>();
    }

    public void writeDoll() {
        System.out.println("Santa Claus Needs A Doll");
        this.setToy("Doll");
    }

    public void writeBike() {
        System.out.println("Santa Claus Needs A Bike");
        this.setToy("Bike");
    }



    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setMagicBoard(this);

    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setMagicBoard(null);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers)
            observer.update();
    }

    @Override
    public String getToy() {
        return this.toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
        this.notifyObservers();
    }
}
