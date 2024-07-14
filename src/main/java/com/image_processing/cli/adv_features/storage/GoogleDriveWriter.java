package com.image_processing.cli.adv_features.storage;

import com.image_processing.cli.utils.Logger;

public class GoogleDriveWriter implements Writer {
    @Override
    public void write(String image) {
        Logger.executeLogger("Logic to write the image into Google Drive.");
    }
}
