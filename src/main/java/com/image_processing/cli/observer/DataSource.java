package com.image_processing.cli.observer;

public class DataSource extends ConcreteSubject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }
}
