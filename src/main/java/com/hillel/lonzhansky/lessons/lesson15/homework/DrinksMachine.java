package com.hillel.lonzhansky.lessons.lesson15.homework;

public enum DrinksMachine {


    TEA(99.99), COFFEE(149.99), LEMONADE(59.99), COLA(200);

    private double price;

    DrinksMachine(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
