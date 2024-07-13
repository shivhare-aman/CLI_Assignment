package com.image_processing.cli.command;

import com.image_processing.cli.observer.ConcreteMonitor;

public interface Command {
    void execute(ConcreteMonitor concreteMonitor);
}
