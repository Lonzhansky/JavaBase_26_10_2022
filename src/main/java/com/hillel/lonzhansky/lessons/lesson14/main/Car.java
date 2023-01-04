package com.hillel.lonzhansky.lessons.lesson14.main;

public class Car {

    public Wheel wheel = new Wheel(3.22);
    public Door door;
    public Engine engine;

    private String modelName;

    public static int staticVariable = 10;


    public Car(String modelName) {
        this.modelName = modelName;
        door = new Door();
        engine = new Engine();
    }


    public void startCar() {
        engine.start();
    }

    public void demo() {
        wheel.pressure = 1;
        wheel.innerClassVariable = 10;

        class LocalClass {
            private int x;
            private int y;

            private void method() {

            }
        }


        class LocalClass2 extends Door {
            private int x;
            private int y;

            private void method() {

            }
        }

        LocalClass localClass = new LocalClass();
        localClass.method();

    }

    class Wheel {
        private double pressure;
        public int innerClassVariable = 0;

        public Wheel(double pressure) {
            this.pressure = pressure;
        }

        public void pressureUp(double value) {
            pressure += value;
        }

        public void pressureDown(double value) {
            pressure -= value;
        }
    }

    public static class Door {

        private void rollUp() {
            System.out.println("rollUp");
        }

        private void rollDown() {
            System.out.println("rollUp");
        }

        public void tryUseNonStaticVariable() {

            //ERROR!!!
//            System.out.println(modelName);
//            demo();
        }

    }

    private class Engine {

        public void start() {
            System.out.println("start " + modelName);
        }

        public void stop() {
            System.out.println("stop " + modelName);
        }

        public void tryUseStaticVariable() {
            System.out.println(staticVariable);
        }
    }

    private class EngineChild extends Engine implements DemoInterface {

        public void start() {
            System.out.println("start " + modelName);
        }

        public void stop() {
            System.out.println("stop " + modelName);
        }

        public void tryUseStaticVariable() {
            System.out.println(staticVariable);
        }

        @Override
        public void methodInterface() {

        }
    }


}
