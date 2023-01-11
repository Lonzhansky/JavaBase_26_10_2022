package com.hillel.lonzhansky.lessons.lesson15.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        start();


    }


    public static void start() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            DrinksMachine drink = getDrink(scanner);

            if (drink == null) {
                break;
            }

            switch (drink) {
                case TEA, COFFEE, COLA, LEMONADE -> DrinkMaker.makeDrink(drink);
            }

            switch (drink) {
                case TEA: {

                }
                case COFFEE : {

                }
                case COLA : {

                }
                case LEMONADE : {
                    DrinkMaker.makeDrink(drink);
                }
            }
        }

    }


    private static DrinksMachine getDrink(Scanner scanner) {
        DrinksMachine[] drinks = DrinksMachine.values();
        DrinksMachine drink = null;
        while (drink == null) {
            System.out.println("Please choose drink from list: " + Arrays.toString(drinks));
            String userValue = scanner.nextLine().toUpperCase();
            if (userValue.equals("EXIT")) {
                System.out.println("stop");
                break;
            }
            for (DrinksMachine drink1 : drinks) {
                if (drink1.toString().equals(userValue)) {
                    drink = drink1;
                    break;
                }
            }
        }

        return drink;
    }
}
