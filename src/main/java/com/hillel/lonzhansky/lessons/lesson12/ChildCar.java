package com.hillel.lonzhansky.lessons.lesson12;

public class ChildCar extends Car {
    public ChildCar(String modelName) {
        super(modelName);
    }


    public void doSomething(){
        System.out.println(publicVariable1);
        System.out.println(publicVariable2);
        System.out.println(publicVariable3);
    }

    public void doSomething2() {
        if (publicVariable3 == 3) {
            System.out.println("3");
        } else {
            System.out.println("else");
        }
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }


}
