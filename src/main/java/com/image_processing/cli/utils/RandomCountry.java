package com.image_processing.cli.utils;

import java.util.Random;

public class RandomCountry {
    public static String getRandomCountry() {
        String[] countries = {"India", "USA", "Uganda", "UK"};
        Random random = new Random();
        int index = random.nextInt(countries.length);
        return countries[index];
    }
}
