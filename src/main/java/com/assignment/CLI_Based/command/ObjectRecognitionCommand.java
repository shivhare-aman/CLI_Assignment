package com.assignment.CLI_Based.command;

import com.assignment.CLI_Based.singleton.Logger;

public class ObjectRecognitionCommand implements Command {
    @Override
    public void execute() {
        Logger.getInstance().log("Recognizing objects in the image");
        System.out.println("Recognizing objects in the image");
    }
}
