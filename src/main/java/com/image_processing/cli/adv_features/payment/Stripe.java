package com.image_processing.cli.adv_features.payment;

import com.image_processing.cli.utils.Logger;

public class Stripe implements Payment {
    @Override
    public void processPayment() {
        Logger.executeLogger("Initiate the Stripe Payment Process.");
    }
}
