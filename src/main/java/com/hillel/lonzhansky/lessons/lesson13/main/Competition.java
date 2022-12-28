package com.hillel.lonzhansky.lessons.lesson13.main;

import com.hillel.lonzhansky.lessons.lesson13.main.obstacles.Obstacle;
import com.hillel.lonzhansky.lessons.lesson13.main.obstacles.Pool;
import com.hillel.lonzhansky.lessons.lesson13.main.obstacles.RunningTrack;
import com.hillel.lonzhansky.lessons.lesson13.main.participants.*;

public class Competition {
    public static void main(String[] args) {

        Obstacle[] obstacles = {
                new Pool(),
                new RunningTrack()
        };

        Participant[] participants = {
//                new Cat("Barsik", 5),
                new Dog("Sharik", 7),
                new Hamster("Hamster", 3),
                new Fish("Fish", 1)
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }

    }
}
