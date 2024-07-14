package com.image_processing.cli.observer;

import com.image_processing.cli.utils.Logger;

public class ConcreteMonitor implements Observer {

    private final DataSource dataSource;

    public ConcreteMonitor(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void updateObserver() {
        Logger.executeLogger("Updating the observer..");
        System.out.println("Fetching data real time : " + dataSource.getValue());
    }
}
