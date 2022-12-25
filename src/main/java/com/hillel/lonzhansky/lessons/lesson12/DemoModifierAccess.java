package com.hillel.lonzhansky.lessons.lesson12;

public class DemoModifierAccess {

    public int publicVariable;
    protected int protectedVariable;
    int packagePrivateVariable;
    private int privateVariable;


    public void publicMethod() {
        System.out.println("publicMethod");
        System.out.println(privateVariable);

        if (privateVariable == 10) {

        }
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    void packagePrivateMethod() {
        System.out.println("packagePrivateMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");

    }


}
