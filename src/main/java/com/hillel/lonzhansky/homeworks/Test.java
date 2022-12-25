package com.hillel.lonzhansky.homeworks;

import com.hillel.lonzhansky.lessons.lesson12.DemoModifierAccess;

public class Test extends DemoModifierAccess {

    public void test() {
        System.out.println(publicVariable);
        System.out.println(protectedVariable);

        publicMethod();
        protectedMethod();
//        packagePrivateMethod();
//        System.out.println(packagePrivateVariable);
    }

}
