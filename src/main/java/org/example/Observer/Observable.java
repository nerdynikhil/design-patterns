package org.example.Observer;

import java.util.Observer;


public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void registerObserver(org.example.Observer.Observer observer);

    void removeObserver(org.example.Observer.Observer observer);

    void notifyObservers();
}
