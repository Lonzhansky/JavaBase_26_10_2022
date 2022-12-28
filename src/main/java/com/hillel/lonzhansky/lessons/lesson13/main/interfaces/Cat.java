package com.hillel.lonzhansky.lessons.lesson13.main.interfaces;

public class Cat extends Animal implements Runnable {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Cat" + name + " run");
    }
}
