package com.image_processing.cli.decorator;

public class Decorator implements DecoratorInterface {

    private final DecoratorInterface decoratorInterface;

    public Decorator(DecoratorInterface decoratorInterface) {
        this.decoratorInterface = decoratorInterface;
    }

    @Override
    public void executeDecorator() {
        decoratorInterface.executeDecorator();
    }
}
