package com.hillel.lonzhansky.lessons.lesson11;


public class Main {
    public static void main(String[] args) {

        Person den = new Person();
        Person alex = new Person("Alex", 33);
//
//        oleg.printName();
//        System.out.println(oleg.getAge());

//        den.name = "Den";
//        den.age = 28;
//        alex.name = "Alex";
//        alex.age = 33;


        den.printName();
        alex.printName();
        den.sayHello();
        System.out.println(den.getAge());


        int a = 10;
        int b = 10;

        Person person1 = new Person("qwerty", 1);
        Person person2 = new Person("qwerty", 1);

        System.out.println(person1.equals(person2));



//        System.out.println(den);
//        System.out.println(alex);


        den.printInfo();


//        Person den = null;
//
//        test(den);
    }

    static void test(Person person) {
        if (person != null) {
            person.sayHello();
        }
    }
}
