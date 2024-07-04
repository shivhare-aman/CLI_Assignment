package com.assignment.CLI_Based.strategy;

public class BackgroundServiceProvider2 implements ServiceProvider {
    @Override
    public void execute() {
        System.out.println("BackgroundServiceProvider2: Removing background");
    }
}
