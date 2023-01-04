package com.hillel.lonzhansky.lessons.lesson14.main;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW");
        car.startCar();


        Car.Door door = new Car.Door();
        door.tryUseNonStaticVariable();


        DemoInterface demoInterface = new DemoInterface() {
            @Override
            public void methodInterface() {
                System.out.println("Hello world");
            }
        };

        demoInterface.methodInterface();

        DemoAbstractClass demoAbstractClass = new DemoAbstractClass() {

            @Override
            void methodInterface1() {

            }

            @Override
            void methodInterface2() {

            }

            @Override
            void methodInterface3() {

            }

            @Override
            void methodInterface4() {

            }
        };

        demoAbstractClass.methodInterface1();
    }
}
