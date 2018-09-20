package com.tong.headFirst.weather;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);
    void notifyObservers();
}
