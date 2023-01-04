package com.hillel.lonzhansky.lessons.lesson14.enums;

public enum TransportType {

//    public static final TransportType CAR = new TransportType("машина");

    CAR("машина"),
    MOTORCYCLE("мотоцикл"),
    BUS("автобус", 1),
    TRUCK("вантажiвка", 2);

    private String title;

    TransportType(String title) {
        this.title = title;
    }

    TransportType(String title, int x) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
