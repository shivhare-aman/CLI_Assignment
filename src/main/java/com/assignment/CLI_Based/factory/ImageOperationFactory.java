package com.assignment.CLI_Based.factory;

import com.assignment.CLI_Based.command.*;
import com.assignment.CLI_Based.strategy.AIServiceProvider1;
import com.assignment.CLI_Based.strategy.BackgroundServiceProvider1;

public class ImageOperationFactory {
    public static Command createOperation(String type) {
        switch (type) {
            case "resize":
                return new ResizeCommand(800, 600);
            case "crop":
                return new CropCommand();
            case "objectRecognition":
                return new ObjectRecognitionCommand();
            case "backgroundRemoval":
                return new BackgroundRemovalCommand(new BackgroundServiceProvider1());
            case "aiExtension":
                return new AIExtensionCommand(new AIServiceProvider1());
            default:
                throw new IllegalArgumentException("Unknown operation type");
        }
    }
}

