package com.hillel.lonzhansky.lessons.lesson13.main.interfaces;

public class Main {
    public static void main(String[] args) {

        System.out.println(Dog.staticIntVariable);
//        System.out.println(Dog.DISTANCE);
//
//        Dog.staticMethod();

        Dog dog1 = new Dog("Sharik1", 4);
        Dog dog2 = new Dog("Sharik2", 4);
        Dog dog3 = new Dog("Sharik3", 4);
        System.out.println(dog1.staticIntVariable);
        System.out.println(dog2.staticIntVariable);
        System.out.println(dog3.staticIntVariable);

        Dog.staticIntVariable = 150;

        System.out.println(Dog.staticIntVariable);
        System.out.println(dog1.staticIntVariable);
        System.out.println(dog2.staticIntVariable);
        System.out.println(dog3.staticIntVariable);


        System.out.println(Runnable.DISTANCE);


        dog1.defaultMethod();


        DogChild dogChild = new DogChild("Dog", 1);



    }
}
