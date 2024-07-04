package com.assignment.CLI_Based.observer;

import com.assignment.CLI_Based.singleton.Logger;

public class OperationMonitor implements Observer {
    @Override
    public void update() {
        Logger.getInstance().log("Operation status updated");
        System.out.println("Operation status updated");
    }
}
