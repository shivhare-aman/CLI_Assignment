package com.image_processing.cli.decorator;

import com.image_processing.cli.utils.Logger;

public class AIDrivenOperation2 extends Decorator {

    public AIDrivenOperation2(DecoratorInterface decoratorInterface) {
        super(decoratorInterface);
    }

    @Override
    public void executeDecorator() {
        super.executeDecorator();
        aiDrivenOperation();
    }

    private void aiDrivenOperation() {
        Logger.executeLogger("Executing AI Driven Operation on Decorated Image..");
        System.out.println("Logic to add AI Driven Operation after BG Removal..");
    }
}
