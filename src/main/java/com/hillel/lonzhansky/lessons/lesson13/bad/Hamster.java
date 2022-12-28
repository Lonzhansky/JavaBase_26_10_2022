package com.hillel.lonzhansky.lessons.lesson13.bad;

public class Hamster {
    String name;
    int age;

    public Hamster(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("Hamster: " + name + " running...");
    }

    public void swim() {
        System.out.println("Hamster: " + name + " swimming...");
    }
}
