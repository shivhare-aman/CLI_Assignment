package com.image_processing.cli.command;

import com.image_processing.cli.observer.ConcreteMonitor;

public class ObjectRecognitionCommand implements Command{
    @Override
    public void execute(ConcreteMonitor concreteMonitor) {
        System.out.println("Logic to identify and describe details of objects here...");
        concreteMonitor.updateObserver();
    }
}
