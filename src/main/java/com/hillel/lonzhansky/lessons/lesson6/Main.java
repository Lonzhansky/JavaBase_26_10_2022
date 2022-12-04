package com.hillel.lonzhansky.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        FOR

//        for(  БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА;
//              БЛОК УМОВИ ВИХОДУ З ЦИКЛУ;
//              БЛОК ЗМІНИ ІТЕРАТОРА (++ або --)
//              )
//              {
//                  код
//              }

//        int iterator = 5;
//
//        for ( ; ; iterator--) {
//
//            if (iterator == 4) {
//                continue;
//            }
//
//            if (iterator == 2) {
//                System.out.println("break");
//                break;
//            }
//
//            System.out.println("Hello Word!");
//            System.out.println(iterator);
//
//
//        }
//
//        System.out.println(iterator);


//        -- BREAK --
//        ОБРИВАННЯ ВСЬОГО ЦИКЛУ

//        -- CONTINUE --
//        ОБРИВАЄ ПОТОЧНУ ІТЕРАЦІЮ

//        for (int i = 0, j = 10; (i < 10) && (j > 5); i++, j--) {
//            System.out.print("i = " + i);
//            System.out.println(" j = " + j);
//        }


//        1)
//        виведення лише парних за допомогою циклу FOR
//        0 2 4 6 8 10 12 14 16 18 20

//        for (int i = 0; i <= 20; i += 2) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }


//        2)
//        Виведіть на екран перші 11 членів послідовності Фібоначчі
//        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

//        int number1 = 0;
//        int number2 = 1;
//        int sum;
//
//        System.out.print(number1 + ", " + number2 + ", ");
//        for (int i = 0; i < 9; i++) {
//            sum = number1 + number2;
//            if (i == 8) {
//                System.out.print(sum);
//            } else {
//                System.out.print(sum + ", ");
//            }
//
////            System.out.print((i < 8) ? sum + ", " : sum);
//
//            number1 = number2;
//            number2 = sum;
//        }


//      WHILE


//        int iterator = 0;
//
//        while (true) {
//            System.out.println("Hello World");
//            iterator++;
//
//            if (iterator == 5) {
//                break;
//            }
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        int number = 0;
//        System.out.println("Please enter number");
//        while (true) {
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Wrong data! try again");
//            }
//            scanner.nextLine();
//        }
//
//        System.out.println("number = " + number);


//        1)
//        a. Зробіть бомбу зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//        b. додайте до вашої бомби умову, якщо бомба розмінована, вона не вибухне (85 - 100) - win
//        int i = 10;
//        while (i >= 0) {
//            System.out.println(i);
//            if (i == 0) {
//                System.out.println("BOOOOOOM!");
//                break;
//            }
//
//            int random = (int) (Math.random() * 101);
//            if (random >= 85 && random <= 100) {
//                System.out.println("random number = " + random);
//                System.out.println("WIN!!!");
//                break;
//            }
//
//            i--;
//        }

//        int i = 10;
//        while (i >= 0) {
//            int random = (int) (Math.random() * 101);
//            if (random >= 85) {
//                System.out.println("Bomb defused");
//                break;
//            }
//            System.out.println((i == 0) ? "Boom!" : i + " sec before explosion");
//            i -= 1;
//        }


//        2)
//        Обчислити факторіал числа від 0 до N (вводимо з консолі) (1 - 10)
//        5! = 1 * 2 * 3 * 4 * 5;
//        3! = 1 * 2 * 3;

//        Scanner scanner = new Scanner(System.in);
//
//        int numberForFactorial = -1;
//
//        System.out.println("Please enter number for factorial from 1 to 10");
//        while (true) {
//            if (scanner.hasNextInt()) {
//                numberForFactorial = scanner.nextInt();
//                if (numberForFactorial >= 1 && numberForFactorial <= 10) {
//                    break;
//                } else {
//                    System.out.println("Enter number from 1 to 10");
//                }
//            } else {
//                System.out.println("Wrong data! Try again");
//            }
//            scanner.nextLine();
//        }
//
//        System.out.println("numberForFactorial = " + numberForFactorial);
//
//        // 5
//        // 1 * 2 * 3 * 4 * 5
//        int result = 1;
//        for (int i = 1; i <= numberForFactorial; i++) {
////            result = result * i;
//            result *= i;
//        }
//
//        System.out.println("result = " + result);


//        3) Homework
//        У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
//        100 космічних шатлів для перевезення людей на Марс так, щоб в
//        У номерах шатлів не траплялося нещасливих чисел. Напишіть функцію,
//        яка виводить усі номери таких шатлів.

        //1 2 3 5 6 7 8 10 11 12 13

//        int counter = 0;
//        for (int i = 1; i <= 10; i++) {
//            if (i == 4 || i == 9) {
//                continue;
//            }
//            System.out.println("number shuttle: " + i);
//            counter++;
//        }
//
//        System.out.println("count shuttle = " + counter);


//        124
//        System.out.println(124 / 100);
//        System.out.println(124 / 10 % 10);
//        System.out.println(124 % 10);

    }
}
