package com.hillel.lonzhansky.lessons.lesson13.bad;

public class MainBad {
    public static void main(String[] args) {

        Pool pool = new Pool();
        RunningTrack runningTrack = new RunningTrack();

        Cat cat = new Cat("Barsik", 5);
        Dog dog = new Dog("Sharik", 7);
        Hamster hamster = new Hamster("Hamster", 3);


        pool.start(cat);
        pool.start(dog);
        pool.start(hamster);

        runningTrack.start(cat);
        runningTrack.start(dog);
        runningTrack.start(hamster);

    }
}
