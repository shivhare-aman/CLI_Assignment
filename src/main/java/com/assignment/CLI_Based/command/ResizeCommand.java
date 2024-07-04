package com.assignment.CLI_Based.command;

import com.assignment.CLI_Based.singleton.Logger;

public class ResizeCommand implements Command {
    private int width;
    private int height;

    public ResizeCommand(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Resizing image to " + width + "x" + height);
        System.out.println("Resizing image to " + width + "x" + height);
    }
}
