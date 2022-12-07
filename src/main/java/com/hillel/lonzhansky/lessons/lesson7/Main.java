package com.hillel.lonzhansky.lessons.lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5};
//
//        int maxValue = array[0];
//        for (int value : array) {
//            maxValue = Math.max(maxValue, value);
//        }
//
//        System.out.println(maxValue);


          // BAD
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = array1;
//
//        System.out.println("Before");
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//
//        System.out.println("After");
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));

        // GOOD
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array1.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            array2[i] = array1[i];
//        }
//
//        System.out.println("Before");
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//        array2[0] = 99;
//
//        System.out.println("After");
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));


//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        String str4 = str3.intern();
//
//        System.out.println(str1 == str4);


//        Integer number1 = 128;
//        Integer number2 = 128;
//
//        System.out.println(number1 == number2);





    }


    static void demo1() {
        int[] array = new int[5];

//        System.out.println(array[-1]);

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
//
////        System.out.println(array[4]);
//
////        System.out.println(array.length);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i - 10;
//        }
//
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
//
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(array);


//        int[] array2 = new int[] {1, 2, 3, 4, 5};
//        int[] array3 =  {6, 7, 8, 9, 10};
//
//
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
    }


    static void task1() {
//   створити масив на 10 елементів та заповнити його випадковими цифрами від 0 до 10
//   вивести на екран в один рядок усі цифри, розділивши їх комою, але у
//   останнього символу не виводити кому

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 11);
        }

//        0, 4, 9, 6, 5, 9, 3, 3, 3, 6
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ((i != numbers.length - 1) ? ", " : ""));

//            if (i == numbers.length - 1) {
//                System.out.print(numbers[i]);
//            } else {
//                System.out.print(numbers[i] + ", ");
//            }
        }
    }


    static void task2() {

/*
     У вбивстві Кеннеді є 10 підозрюваних. Для кожного підозрюваного
     встановлено ймовірність того, що він був убивцею. Всі ці ймовірності
     записані як масив чисел. Написати функцію, яка і визначить
     номер підозрюваного, якого треба ув'язнити.
*/

//        int[] array = new int[10];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 101);
//        }
//
//        System.out.println(Arrays.toString(array));
//
//
//        int maxValue = -1;
//
//        for (int i = 0; i < array.length; i++) {
////            if (array[i] > maxValue) {
////                maxValue = array[i];
////            }
//
//            maxValue = Math.max(maxValue, array[i]);
//        }
//
//        System.out.println("killer persentage: " + maxValue);


        int[] array = {1, 44, 98, 44, 22, 33, 55, 22, 98, 10};

        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            maxValue = Math.max(maxValue, array[i]);
        }

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == maxValue) {
//                System.out.println("index: " + i + ", chance:" + array[i]);
//            }
//        }


//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            if (array[i] == array[array.length-1]) {
//                System.out.println("index: " + i + ", chance:" + array[i]);
//            } else  {
//                break;
//            }
//        }


        // HARD VERSION
//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
//        System.out.println(arrayList);
//        System.out.println(arrayList.indexOf(maxValue));


    }
}
