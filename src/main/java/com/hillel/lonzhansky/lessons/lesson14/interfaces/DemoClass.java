package com.hillel.lonzhansky.lessons.lesson14.interfaces;

public class DemoClass implements Demo1, Demo2 {

    @Override
    public void defaultMethod() {
        Demo1.super.defaultMethod();
        Demo2.super.defaultMethod();
        System.out.println("dfgdfgdfgdf");
    }

}
