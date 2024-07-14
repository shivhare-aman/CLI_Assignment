package com.image_processing.cli.command;

import com.image_processing.cli.observer.DataSource;

public class ObjectRecognitionCommand implements Command{
    @Override
    public void execute(DataSource dataSource) {
        System.out.println("Logic to identify and describe details of objects here...");
        dataSource.setValue(3);
    }
}
