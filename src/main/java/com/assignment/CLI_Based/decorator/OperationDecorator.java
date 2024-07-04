package com.assignment.CLI_Based.decorator;

abstract class OperationDecorator implements ImageOperation {
    protected ImageOperation decoratedOperation;

    public OperationDecorator(ImageOperation decoratedOperation) {
        this.decoratedOperation = decoratedOperation;
    }

    public void execute() {
        decoratedOperation.execute();
    }
}
