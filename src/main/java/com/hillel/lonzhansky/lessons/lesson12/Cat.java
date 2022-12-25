package com.hillel.lonzhansky.lessons.lesson12;

import javax.xml.namespace.QName;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println("Cat: " + name + " eat");
    }

    @Override
    public void run() {
        System.out.println("Cat: " + name + " run");
    }
}
