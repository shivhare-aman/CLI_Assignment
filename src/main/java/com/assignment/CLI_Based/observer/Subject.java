package com.assignment.CLI_Based.observer;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
