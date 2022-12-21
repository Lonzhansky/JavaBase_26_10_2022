package com.hillel.lonzhansky.lessons.lesson11;

import java.util.Objects;

public class Person {

    //global variables
    String name;
    String phoneNumber;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String phoneNumber) {
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
        name = "NAME";
        age = 99;

        System.out.println("TEST!!!!");
        System.out.println(this);
    }

    void printName() {
        String qwerty = "QWERTY";
        System.out.println("name = " + this.name);
    }

    void sayHello() {
        System.out.println(name + " say hello");
    }

    int getAge() {
        return age;
    }

    void printInfo() {
        String info = "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

        System.out.println(info);
    }

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        return age == person.age;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", age=" + age;
    }
}
