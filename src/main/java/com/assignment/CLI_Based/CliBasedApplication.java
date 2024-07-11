package com.assignment.CLI_Based;

import com.assignment.CLI_Based.adapter.ThirdPartyLibrary;
import com.assignment.CLI_Based.adapter.ThirdPartyLibraryAdapter;
import com.assignment.CLI_Based.command.Command;
import com.assignment.CLI_Based.decorator.ConcreteImageOperation;
import com.assignment.CLI_Based.decorator.CropDecorator;
import com.assignment.CLI_Based.decorator.ImageOperation;
import com.assignment.CLI_Based.decorator.ResizeDecorator;
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

        ImageOperation baseOperation = new ConcreteImageOperation();
        ImageOperation resizeDecorator = new ResizeDecorator(baseOperation, 800, 600);
        ImageOperation cropDecorator = new CropDecorator(baseOperation);

        ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary();
        ImageOperation thirdPartyAdapter = new ThirdPartyLibraryAdapter(thirdPartyLibrary);

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

        resizeDecorator.execute();
        subject.notifyObservers();

        cropDecorator.execute();
        subject.notifyObservers();

        thirdPartyAdapter.execute();
        subject.notifyObservers();
    }
}
