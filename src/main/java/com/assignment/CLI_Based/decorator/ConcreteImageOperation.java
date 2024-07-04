package com.assignment.CLI_Based.decorator;

public class ConcreteImageOperation implements ImageOperation {
    @Override
    public void execute() {
        System.out.println("Performing base image operation");
    }
}
