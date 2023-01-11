package com.hillel.lonzhansky.lessons.lesson15.homework;

public class DrinkMaker {
    public static void makeTea() {
        System.out.println("preparing tea...");
    }

    public static void makeDrink(DrinksMachine drink) {
        System.out.println("preparing " + drink.toString() + "...");
    }
}
