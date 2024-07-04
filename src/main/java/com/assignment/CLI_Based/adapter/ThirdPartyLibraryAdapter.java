package com.assignment.CLI_Based.adapter;

import com.assignment.CLI_Based.decorator.ImageOperation;
import com.assignment.CLI_Based.singleton.Logger;

public class ThirdPartyLibraryAdapter implements ImageOperation {
    private ThirdPartyLibrary thirdPartyLibrary;

    public ThirdPartyLibraryAdapter(ThirdPartyLibrary thirdPartyLibrary) {
        this.thirdPartyLibrary = thirdPartyLibrary;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Using third-party library for image processing");
        System.out.println("Using third-party library for image processing");
        thirdPartyLibrary.performOperation();
    }
}
