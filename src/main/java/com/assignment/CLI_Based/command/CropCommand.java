package com.assignment.CLI_Based.command;

import com.assignment.CLI_Based.singleton.Logger;

public class CropCommand implements Command {
    @Override
    public void execute() {
        Logger.getInstance().log("Cropping image");
        System.out.println("Cropping image");
    }
}
