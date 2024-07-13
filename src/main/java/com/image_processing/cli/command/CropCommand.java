package com.image_processing.cli.command;

import com.image_processing.cli.observer.ConcreteMonitor;

public class CropCommand implements Command{
    @Override
    public void execute(ConcreteMonitor concreteMonitor) {
        System.out.println("Logic to crop the command here..");
        concreteMonitor.updateObserver();
    }
}
