package com.image_processing.cli.decorator;

import com.image_processing.cli.utils.Logger;

public class Watermark extends Decorator{

    public Watermark(DecoratorInterface decoratorInterface) {
        super(decoratorInterface);
    }

    @Override
    public void executeDecorator() {
        super.executeDecorator();
        addWatermark();
    }

    private void addWatermark() {
        Logger.executeLogger("Implementing Watermark on Decorated Image..");
        System.out.println("Logic to add Watermark after AI Driven Operation and BG Removal..");
    }
}
