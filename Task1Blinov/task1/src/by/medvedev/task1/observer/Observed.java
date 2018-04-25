package by.medvedev.task1.observer;

public interface Observed {
    void attach(Observer ob);
    void detach(Observer ob);
    void notifyObservers();
}
