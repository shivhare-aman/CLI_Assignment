package com.image_processing.cli.utils;

public class DBWriter implements Writer {
    @Override
    public void write(String image) {
        Logger.executeLogger("Logic to write the image into the DB.");
    }
}
