package com.image_processing.cli;

import com.image_processing.cli.adv_features.payment.Payment;
import com.image_processing.cli.adv_features.payment.Paypal;
import com.image_processing.cli.adv_features.payment.Stripe;
import com.image_processing.cli.command.Command;
import com.image_processing.cli.decorator.*;
import com.image_processing.cli.factory.OperationFactory;
import com.image_processing.cli.observer.ConcreteMonitor;
import com.image_processing.cli.observer.DataSource;
import com.image_processing.cli.observer.Observer;
import com.image_processing.cli.adv_features.storage.Writer;
import com.image_processing.cli.utils.RandomCountry;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CliApplication {
	public static void main(String[] args) {
		System.out.println("------------------------------");

//	--------------------------------------------------------------------------------------------------------------------

		// Implement real time monitoring system (change to pull style of observer)

		DataSource dataSource = new DataSource();
		Observer monitor = new ConcreteMonitor(dataSource);
		dataSource.attach(monitor);

//	--------------------------------------------------------------------------------------------------------------------

		Command resize = OperationFactory.getCommand("resize");
		Command crop = OperationFactory.getCommand("crop");
		Command objectRecognition = OperationFactory.getCommand("object-recognition");
		Command bgRemoval = OperationFactory.getCommand("background-removal");
		Command aiExtension = OperationFactory.getCommand("ai-extension");

		// There are few other ways to do the below task.
		// But it's hard to pick the best one. So I went with this.

		resize.execute(dataSource);
		crop.execute(dataSource);
		objectRecognition.execute(dataSource);
		bgRemoval.execute(dataSource);
		aiExtension.execute(dataSource);

		// Above inside the implementations we can add logic for cost calculations as well.
		// But for now I am skipping this as it is very direct.

//	--------------------------------------------------------------------------------------------------------------------

		// Not sure of this...
		// Log each operation after execution (Singleton fashion)

//	--------------------------------------------------------------------------------------------------------------------

		System.out.println("------------------------------");

		// Operation Bundling using decorator.
		// Background Removal --> AI Driven Operations --> Watermark..

		DecoratorInterface decoratorInterface = new ConcreteBGRemoval();
		DecoratorInterface aiDrivenOperation2 = new AIDrivenOperation2(decoratorInterface);
		DecoratorInterface watermark = new Watermark(aiDrivenOperation2);
		watermark.executeDecorator();

		System.out.println("------------------------------");

//	--------------------------------------------------------------------------------------------------------------------

		// Below is the logic to store the image to the cloud.

		String image = "image-here";
		Writer dbWriter = OperationFactory.getWriter("db");
		Writer s3Writer = OperationFactory.getWriter("aws-s3");
		Writer gDriveWriter = OperationFactory.getWriter("google-drive");

		dbWriter.write(image);
		s3Writer.write(image);
		gDriveWriter.write(image);

		System.out.println("------------------------------");

//	--------------------------------------------------------------------------------------------------------------------

		// Payment Integration : Can be done similarly like Storage inside utils.

		String region = RandomCountry.getRandomCountry();
		Payment paymentIntent;

		if (region.equals("India")) {
			paymentIntent = new Paypal();
		} else {
			paymentIntent = new Stripe();
		}

		paymentIntent.processPayment();

//	--------------------------------------------------------------------------------------------------------------------

		// Result Downloading : Quite straight forward.

		// Future scope : Expand to include direct integration with cloud.

//	--------------------------------------------------------------------------------------------------------------------
	}

}
