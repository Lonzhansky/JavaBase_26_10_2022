package com.hillel.lonzhansky.lessons.lesson13.bad;

public class Dog {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("Dog: " + name + " running...");
    }

    public void swim() {
        System.out.println("Dog: " + name + " swimming...");
    }
}
