package com.hillel.lonzhansky.lessons.lesson10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printHello();
//        String name = "Den";
//        printHelloWithName(name);

//        int x = 1;
//        changeVariableValue(x);
//
//        System.out.println("from main: " + x);


//        int[] array = {1, 2, 3, 4};
//        System.out.println("from main " + Arrays.toString(array));
//
//        changeArrayValue(array);
//
//        System.out.println("from main " + Arrays.toString(array));


//        int a = 10;
//        int b = 5;
//
//        double result = getSum(10.1, 11, 10.2);
//        System.out.println(result);


//        int result = demo(1, 1);
//        System.out.println(result);


//        int sum = getSum(1, 2, 3, 4, 5);
//        System.out.println(sum);

//        demoRecursion(1);


//        System.out.println(getFactorial(5));


//        personInfo("Will", "Smith", "New York", "2936729462846");
//        personInfo("Will2", "Smith2", "New York", "2936729462846");
//        personInfo("Will3", "Smith3", "New York", "2936729462846");


    }


    static int getFactorial(int number) {
//        if (number == 0) {
//            return 1;
//        }  else {
//            return number * getFactorial(number - 1);
//        }
        return number == 0 ? 1 : number * (getFactorial(number - 1));


    }


    static int demoRecursion(int x) {
        if (x != 6) {
            System.out.println(x);
            return demoRecursion(++x);
        } else {
            return -1;
        }
    }


    // Varargs
    static int getSum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }


    static int demo(int a, int b) {
        int result = demo(a, b, 10);
        return result;
    }

    static int demo(int a, int b, int c) {
        int result = demo(a, b, c, 10);
        return result;
    }

    static int demo(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    static double getSum(double x, int y, double z) {
        double sum = x + y + z;
        return sum;
    }


    static double getSum(double x, double y, double z) {
        double sum = x + y + z;
        return sum;
    }

    static double getSum(double x, double y, int z) {
        double sum = x + y + z;
        return sum;
    }

    static double getSum(double x, int y, int z) {
        double sum = x + y + z;
        return sum;
    }

    static int getSum(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    static int getSum(int a, int b) {
        int sum = a + b;
        return sum;

//        return a + b;
    }


    static void changeArrayValue(int[] array) {
        array[0] = 99;
        System.out.println("from changeArrayValue " + Arrays.toString(array));
    }

    static void changeVariableValue(int x) {
        x = 10;
        System.out.println("from changeVariableValue: " + x);
    }

    static void printHello() {
        System.out.println("Hello");
    }

    static void printHelloWithName(String name) {
        System.out.println("Hello " + name);
    }


}
