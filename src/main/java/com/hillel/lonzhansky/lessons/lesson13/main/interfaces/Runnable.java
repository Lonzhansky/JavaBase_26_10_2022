package com.hillel.lonzhansky.lessons.lesson13.main.interfaces;

public interface Runnable {

    int DISTANCE = 10;

    void run();

    default void defaultMethod() {
        System.out.println("its default method");
    }

}
