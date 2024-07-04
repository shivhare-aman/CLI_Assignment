package com.assignment.CLI_Based.decorator;

import com.assignment.CLI_Based.singleton.Logger;

public class ResizeDecorator extends OperationDecorator {
    private int width;
    private int height;

    public ResizeDecorator(ImageOperation decoratedOperation, int width, int height) {
        super(decoratedOperation);
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        decoratedOperation.execute();
        Logger.getInstance().log("Resizing image to " + width + "x" + height);
        System.out.println("Resizing image to " + width + "x" + height);
    }
}
