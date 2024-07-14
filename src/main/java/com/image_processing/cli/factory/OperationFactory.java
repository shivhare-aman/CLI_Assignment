package com.image_processing.cli.factory;

import com.image_processing.cli.command.*;
import com.image_processing.cli.strategy.AIServiceProvider1;
import com.image_processing.cli.strategy.BGRemovalProvider1;
import com.image_processing.cli.adv_features.storage.AwsS3Writer;
import com.image_processing.cli.adv_features.storage.DBWriter;
import com.image_processing.cli.adv_features.storage.GoogleDriveWriter;
import com.image_processing.cli.adv_features.storage.Writer;

public class OperationFactory {
    public static Command getCommand(String getCommandValue) {
        return switch (getCommandValue) {
            case "resize" -> new ResizeCommand();
            case "crop" -> new CropCommand();
            case "object-recognition" -> new ObjectRecognitionCommand();
            case "background-removal" -> new BackgroundRemovalCommand(new BGRemovalProvider1());
            case "ai-extension" -> new AIDrivenOperationCommand(new AIServiceProvider1());
            default -> throw new IllegalArgumentException("No valid command passed..");
        };
    }

    public static Writer getWriter(String type) {
        return switch (type) {
            case "aws-s3" -> new AwsS3Writer();
            case "google-drive" -> new GoogleDriveWriter();
            case "db" -> new DBWriter();
            default -> throw new IllegalArgumentException("No valid type passed..");
        };
    }
}
