package com.image_processing.cli.decorator;

import com.image_processing.cli.utils.Logger;

public class ConcreteBGRemoval implements DecoratorInterface {
    @Override
    public void executeDecorator() {
        Logger.executeLogger("Executing Operation Bundling using Decorator..");
        System.out.println("Executing Concrete logic for Background Removal..");
    }
}
