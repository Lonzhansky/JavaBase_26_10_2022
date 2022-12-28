package com.hillel.lonzhansky.lessons.lesson13.main.obstacles;

import com.hillel.lonzhansky.lessons.lesson13.main.participants.Participant;

public class Pool implements Obstacle {

    @Override
    public void start(Participant participant) {
        participant.swim();
    }
}
