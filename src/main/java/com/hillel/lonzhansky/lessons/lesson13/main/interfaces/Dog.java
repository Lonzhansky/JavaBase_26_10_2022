package com.hillel.lonzhansky.lessons.lesson13.main.interfaces;

public class Dog extends Animal implements Runnable, Swimmable, Cloneable {

    public static int staticIntVariable = 100;

    public Dog(String name, int age) {
        super(name, age);
    }

    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    @Override
    public void run() {
        System.out.println("Dog" + name + " run");
    }

    @Override
    public void swim() {
        System.out.println("Dog" + name + " swim");
    }

    @Override
    public void defaultMethod() {
        Runnable.super.defaultMethod();
    }
}
