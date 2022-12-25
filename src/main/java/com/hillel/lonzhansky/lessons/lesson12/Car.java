package com.hillel.lonzhansky.lessons.lesson12;

public class Car {

    public String modelName;
    public int publicVariable1;
    public int publicVariable2;
    public int publicVariable3;

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startEngine();
    }

    void stop() {
        stopEngine();
        stopFuelSystem();
        stopElectronicSystem();
    }

    private void startEngine() {
        System.out.println("startEngine");
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }

    private void startElectronicSystem() {
        System.out.println("startElectronicSystem");
    }

    private void stopEngine() {
        System.out.println("stopEngine");
    }

    private void stopFuelSystem() {
        System.out.println("stopFuelSystem");
    }

    private void stopElectronicSystem() {
        System.out.println("stopElectronicSystem");
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

}
