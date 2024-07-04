package com.assignment.CLI_Based.decorator;

import com.assignment.CLI_Based.singleton.Logger;

public class CropDecorator extends OperationDecorator {
    public CropDecorator(ImageOperation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public void execute() {
        decoratedOperation.execute();
        Logger.getInstance().log("Cropping image");
        System.out.println("Cropping image");
    }
}
