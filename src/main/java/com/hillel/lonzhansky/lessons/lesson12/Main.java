package com.hillel.lonzhansky.lessons.lesson12;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW");
        System.out.println(car.getModelName());

        System.out.println(car.modelName);

        car.start();
        car.stop();

        System.out.println(car.publicVariable1);
        System.out.println(car.publicVariable2);
        System.out.println(car.publicVariable3);


    }

    public static void demo1() {
        //        Animal animal = new Animal("Name", 10);

        Dog dog = new Dog("Sharik", 8, 100);
        Cat cat = new Cat("Barsik", 11);


//        animal.run();
//        animal.eat();
//        animal.swim();

        System.out.println();
        System.out.println();

        dog.run();
        dog.swim();
//        dog.eat();
        System.out.println();
        System.out.println();

        cat.run();
        cat.eat();
//        cat.swim();
    }
}
