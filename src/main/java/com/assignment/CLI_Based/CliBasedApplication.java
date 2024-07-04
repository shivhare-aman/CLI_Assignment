package com.assignment.CLI_Based;

import com.assignment.CLI_Based.command.Command;
import com.assignment.CLI_Based.factory.ImageOperationFactory;
import com.assignment.CLI_Based.observer.ConcreteSubject;
import com.assignment.CLI_Based.observer.OperationMonitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliBasedApplication {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        OperationMonitor monitor = new OperationMonitor();
        subject.attach(monitor);

        Command resizeCommand = ImageOperationFactory.createOperation("resize");
        Command cropCommand = ImageOperationFactory.createOperation("crop");
        Command objectRecognitionCommand = ImageOperationFactory.createOperation("objectRecognition");
        Command backgroundRemovalCommand = ImageOperationFactory.createOperation("backgroundRemoval");
        Command aiExtensionCommand = ImageOperationFactory.createOperation("aiExtension");

        resizeCommand.execute();
        subject.notifyObservers();

        cropCommand.execute();
        subject.notifyObservers();

        objectRecognitionCommand.execute();
        subject.notifyObservers();

        backgroundRemovalCommand.execute();
        subject.notifyObservers();

        aiExtensionCommand.execute();
        subject.notifyObservers();
    }
}
