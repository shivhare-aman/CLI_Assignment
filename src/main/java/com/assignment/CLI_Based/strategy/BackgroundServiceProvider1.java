package com.assignment.CLI_Based.strategy;

public class BackgroundServiceProvider1 implements ServiceProvider {
    @Override
    public void execute() {
        System.out.println("BackgroundServiceProvider1: Removing background");
    }
}
