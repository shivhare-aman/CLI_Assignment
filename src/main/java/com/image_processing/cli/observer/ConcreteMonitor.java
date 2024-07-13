package com.image_processing.cli.observer;

import com.image_processing.cli.utils.Logger;

public class ConcreteMonitor implements Observer {
    @Override
    public void updateObserver() {
        Logger.executeLogger("Updating the observer..");
    }
}
