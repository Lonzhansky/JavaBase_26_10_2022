package com.hillel.lonzhansky.lessons.lesson13.bad;

public class Cat {

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        System.out.println("Cat: " + name + " running...");
    }

    public void swim() {
        System.out.println("Cat: " + name + " swimming...");
    }
}
