package com.hillel.lonzhansky.lessons.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 7;
//        int b = 1;
//        while (a < b) {
//            System.out.println("Hello");
//        }

//        do {
//            System.out.println("Hello");
//        } while (a < b);


        // O(N)
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }


//        O(N) * O(N) => O(N^2)
//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 3; j++) {
//                counter++;
//            }
//        }
//
//        System.out.println(counter);

//        O(N) * O(N) * O(N) => O(N^3)
//        int counter = 0;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//                    counter++;
//                }
//            }
//        }
//        System.out.println(counter);


//        Integer[] array = {99, 7, -2, 6, -20, 100, -55}; //-> -55, -20, -2, 6, 7, 99, 100


//        int current;
//        int next;
//        int counter = 0;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                current = array[j];
//                next = array[j + 1];
//
//                if (current > next) {
//                    array[j + 1] = current;
//                    array[j] = next;
//                }
//            }
//        }

//        int temp;
//        int counter = 0;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] < array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println("counter = " + counter);


//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));


//        int[] array = {99, 7, -2, 6, -20, 100, -55};
//
//        int max = array[0];
//        int maxIndex = 0;
//        int min = array[0];
//        int minIndex = 0;
//
//        for (int i = 1; i < array.length; i++) {
////            if (max < array[i]) {
////                max = array[i];
////                maxIndex = i;
////            }
//
//            max = Math.max(max, array[i]);
//
////            if (min > array[i]) {
////                min = array[i];
////                minIndex = i;
////            }
//            min = Math.min(max, array[i]);
//        }
//
//        System.out.println("max = " + max + ", index: " + maxIndex);
//        System.out.println("min = " + min+ ", index: " + minIndex);

//        int[] array = {99, 7, -2, -6, -20, 100, -55, 43, 7, 23, 54, 213, -2};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        System.out.println(Arrays.binarySearch(array, 275));

//        System.out.println(demoLogN(array, 6));


//        int element = 6;
//        int elementIndex = -1;
//
//        int firstIndex = 0;
//        int lastIndex = array.length - 1;
//
//        while (firstIndex <= lastIndex) {
//            int middleIndex = (firstIndex + lastIndex) / 2;
//            if (array[middleIndex] == element) {
//                elementIndex = middleIndex;
//                break;
//            } else if (array[middleIndex] < element) {
//                firstIndex = middleIndex + 1;
//            } else {
//                lastIndex = middleIndex - 1;
//            }
//        }
//
//        System.out.println("elementIndex: " + elementIndex);


//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOf(array1, 40);
//        int[] array2 = Arrays.copyOfRange(array1, 1, array1.length - 1);
//
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));
//
//
//        int[] array1 = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array1.length];
//
//        System.arraycopy(array1, 2, array2, 3, 2);
//        System.out.println(Arrays.toString(array1));
//        System.out.println(Arrays.toString(array2));













        // Створити масив із N чисел (вводимо з консолі)
        // Розбити його на 2 масиви рівної довжини
        // Відсортувати першу половину масиву за зростанням та вивести на екран
        // другу половину масиву відсортувати у зворотному порядку і теж вивести на екран


        int N = -1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter length array");

        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N % 2 == 0) {
                    break;
                } else {
                    System.out.println("Please enter even number");
                }
            } else {
                System.out.println("Wrong data. Try again!");
                scanner.nextLine();
            }
        }


        Integer[] array = new Integer[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        System.out.println("source array:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        int middle = array.length / 2;
        Integer[] first = new Integer[middle];
        Integer[] second = new Integer[middle];

        System.arraycopy(array, 0, first, 0, middle);
        System.arraycopy(array, middle, second, 0, middle);

        System.out.println("first array:");
        System.out.println(Arrays.toString(first));
        System.out.println("second array");
        System.out.println(Arrays.toString(second));
        System.out.println();

        Arrays.sort(first);
        Arrays.sort(second, Collections.reverseOrder());

        System.out.println("first array after sort:");
        System.out.println(Arrays.toString(first));
        System.out.println("second array after sort:");
        System.out.println(Arrays.toString(second));











    }


    /**
     * O(logN)
     * Самый худший вариант для массива из 16 элементов
     * N = 16 - 2^4
     * N = 8 - 2^3
     * N = 4 - 2^2
     * N = 2 - 2^1
     * N = 1 - 2^0
     * <p>
     * 2^4=16 - 2^k = N или из математики     k = log2N
     * O(k) = O(log2N)
     * Основание логарифма является константой поэтому не играет роли:
     * O(k) = O(logN)
     */
    static int demoLogN(int[] array, int element) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (array[middleIndex] == element) {
                return middleIndex;
            } else if (array[middleIndex] < element) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
