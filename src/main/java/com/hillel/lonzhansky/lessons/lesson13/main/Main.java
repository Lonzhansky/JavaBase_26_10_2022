package com.hillel.lonzhansky.lessons.lesson13.main;

import com.hillel.lonzhansky.lessons.lesson13.main.participants.Dog;
import com.hillel.lonzhansky.lessons.lesson13.main.participants.DogChild;
import com.hillel.lonzhansky.lessons.lesson13.main.participants.Hamster;
import com.hillel.lonzhansky.lessons.lesson13.main.participants.Participant;

public class Main {
    public static void main(String[] args) {

        Participant participant1 = new DogChild("Sharik", 7);
        Participant participant2 = new Hamster("Hamster", 1);

        demo(participant1);
        demo(participant2);

    }

    public static void demo(Participant participant) {
//        if (participant instanceof Dog) {
////            ((Dog) participant).demo();
//            Dog dog = (Dog) participant;
//            dog.demo();
//        } else {
//            participant.run();
//        }

        System.out.println(participant.getClass());
        System.out.println(Dog.class);

        if (participant.getClass() == Dog.class) {
//            ((Dog) participant).demo();
            Dog dog = (Dog) participant;
            dog.demo();
        } else {
            participant.run();
        }
    }
}
