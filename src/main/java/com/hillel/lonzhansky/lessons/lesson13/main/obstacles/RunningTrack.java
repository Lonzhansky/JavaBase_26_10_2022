package com.hillel.lonzhansky.lessons.lesson13.main.obstacles;


import com.hillel.lonzhansky.lessons.lesson13.main.participants.Participant;

public class RunningTrack implements Obstacle {

    @Override
    public void start(Participant participant) {
        participant.run();
    }

}