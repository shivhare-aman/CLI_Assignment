package com.image_processing.cli.utils;

public class AwsS3Writer implements Writer {
    @Override
    public void write(String image) {
        Logger.executeLogger("Logic to write the image into AWS S3.");
    }
}
