package com.hillel.lonzhansky.lessons.lesson12;

public class ChildDog extends Dog {
    public ChildDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("test");
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
