package observer;

import java.util.ArrayList;
import java.util.List;

public class Athlete implements  Observable {

    private List<Observer> observers;
    private String position;

    public Athlete(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void startWatcing(Observer observer) {
        this.observers.add(observer);
        observer.setPosition(this);
    }

    @Override
    public void stopWatcing(Observer observer) {
        this.observers.remove(observer);
        observer.setPosition(null);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.position;
    }
    public void setPosition(String position ){
        this.position = position;
        this.notifyObservers();
    }
}
