package com.image_processing.cli.adv_features.storage;

import com.image_processing.cli.utils.Logger;

public class AwsS3Writer implements Writer {
    @Override
    public void write(String image) {
        Logger.executeLogger("Logic to write the image into AWS S3.");
    }
}
