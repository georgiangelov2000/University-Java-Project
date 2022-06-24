package observer;
public interface Observable {
    void stopWatcing(Observer observer);
    void startWatcing(Observer observer);

    void notifyObservers();
    String getUpdate();
}
