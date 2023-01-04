package com.hillel.lonzhansky.lessons.lesson14.interfaces;

public interface Demo1 {

    default void defaultMethod() {
        System.out.println("method from Demo1");
    }

}
