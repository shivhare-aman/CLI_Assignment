package com.assignment.CLI_Based.command;

import com.assignment.CLI_Based.singleton.Logger;
import com.assignment.CLI_Based.strategy.ServiceProvider;

public class AIExtensionCommand implements Command {
    private ServiceProvider serviceProvider;

    public AIExtensionCommand(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("AI-driven extension using " + serviceProvider.getClass().getSimpleName());
        serviceProvider.execute();
    }
}
