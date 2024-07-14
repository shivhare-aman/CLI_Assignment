package com.image_processing.cli.command;

import com.image_processing.cli.observer.DataSource;
import com.image_processing.cli.strategy.ServiceProvider;

public class BackgroundRemovalCommand implements Command {

    private final ServiceProvider serviceProvider;

    public BackgroundRemovalCommand(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public void execute(DataSource dataSource) {
        serviceProvider.executeService();
        dataSource.setValue(4);
    }
}
