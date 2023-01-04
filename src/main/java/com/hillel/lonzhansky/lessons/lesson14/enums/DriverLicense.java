package com.hillel.lonzhansky.lessons.lesson14.enums;

public class DriverLicense {
    private static int counter;

    public DriverLicense() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
