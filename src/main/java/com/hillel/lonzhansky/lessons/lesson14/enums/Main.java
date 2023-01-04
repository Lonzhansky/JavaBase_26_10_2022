package com.hillel.lonzhansky.lessons.lesson14.enums;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println(TransportType.MOTORCYCLE.getTitle());


//        TransportType[] values = TransportType.values();
//
//        System.out.println(Arrays.toString(values));


//        for (TransportType value : TransportType.values()) {
//            System.out.println(value.getTitle());
//        }


//        TransportType car = TransportType.valueOf("CAR");
//        System.out.println(car.getTitle());

        runApp();
        System.out.println("count license: " + DriverLicense.getCounter());
    }


    public static void runApp() {

        Scanner scanner = new Scanner(System.in);

        TransportType[] transportTypes = TransportType.values();

        TransportType userTransportType = null;

        while (true) {
            System.out.println("Please enter transport type from list: " + Arrays.toString(transportTypes));
            String userValue = scanner.nextLine();
            userValue = userValue.toUpperCase();


            for (TransportType transportType : transportTypes) {
                if (transportType.toString().equals(userValue)) {
                    userTransportType = TransportType.valueOf(userValue);
                    break;
                }
            }

//            try {
//                TransportType.valueOf(userValue);
//            } catch (IllegalArgumentException e) {
//
//            }

            if (userTransportType != null) {
                break;
            }
        }


        switch (userTransportType) {
            case CAR: {
                new DriverLicense();
                System.out.println("Take your license for " + TransportType.CAR.getTitle());
                break;
            }

            case MOTORCYCLE: {
                new DriverLicense();
                System.out.println("Take your license for " + TransportType.MOTORCYCLE.getTitle());
                break;
            }

            case TRUCK: {
                new DriverLicense();
                System.out.println("Take your license for " + TransportType.TRUCK.getTitle());
                break;
            }

            case BUS: {
                new DriverLicense();
                System.out.println("Take your license for " + TransportType.BUS.getTitle());
                break;
            }

        }


    }


}
