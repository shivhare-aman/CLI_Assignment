package com.image_processing.cli.command;

import com.image_processing.cli.observer.DataSource;

public class ResizeCommand implements Command {
    @Override
    public void execute(DataSource dataSource) {
        System.out.println("Logic to resize the command here....");
        dataSource.setValue(1);
    }
}
