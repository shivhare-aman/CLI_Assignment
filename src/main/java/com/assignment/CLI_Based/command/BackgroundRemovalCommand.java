package com.assignment.CLI_Based.command;

import com.assignment.CLI_Based.singleton.Logger;
import com.assignment.CLI_Based.strategy.ServiceProvider;

public class BackgroundRemovalCommand implements Command {
    private ServiceProvider serviceProvider;

    public BackgroundRemovalCommand(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Removing background using " + serviceProvider.getClass().getSimpleName());
        serviceProvider.execute();
    }
}
