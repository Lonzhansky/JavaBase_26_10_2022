package com.hillel.lonzhansky.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;

//        if (a <= b) {
//            System.out.println("Hello");
//        }
//
//        if (a >= b) {
//            System.out.println("Bye");
//        }
//
//        if (a == b) {
//            System.out.println("Bye!!!");
//        }

//        if (a > b) {
//            System.out.println("Hello");
//            System.out.println("Hello");
//            System.out.println("Hello");
//            System.out.println("Hello");
//        } else {
//            System.out.println("Bye!!!");
//            System.out.println("Bye!!!");
//            System.out.println("Bye!!!");
//            System.out.println("Bye!!!");
//            System.out.println("Bye!!!");
//        }

//        int a = 10;
//        int b = 20;
//
//        if (a < b) {
//            System.out.println("a < b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a == b");
//        }
//
//
//        if (a < b) {
//            System.out.println("a < b");
//        }
//        if (a > b) {
//            System.out.println("a > b");
//        }
//        if (a == b) {
//            System.out.println("a == b");
//        }


//        int a = 30;
//        int b = 20;
//
//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else {
//                System.out.println("a = b");
//            }
//        } else {
//            System.out.println("a < b");
//        }


//        int a = 30;
//        int b = 20;

//        if (a > b) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
////        умова ? вираз1 : вираз2
//        System.out.println((a > b) ? "YES" : "NO");


//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println("a == b");
//        }
////        умова ? вираз1 : вираз2
//        System.out.println(((a > b) ? "a > b" : (a > b) ? "a > b" : "a == b"));




        int a = 33;

//        if (a == 1) {
//            System.out.println("1");
//        }
//        if (a == 2) {
//            System.out.println("2");
//        }
//        if (a == 3) {
//            System.out.println("3");
//        }
//        if (a == 4) {
//            System.out.println("4");
//        }
//        if (a == 5) {
//            System.out.println("5");
//        }





//        switch (a) {
//
//            case 1: {
//                System.out.println("1");
//                break;
//            }
//            case 2: {
//                System.out.println("2");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            case 5: {
//                System.out.println("5");
//                break;
//            }
//
//
//            default: {
//                System.out.println("default");
//                break;
//            }
//
//        }


        String str1 = "QWERTY";
        String str2 = "QWERTY";
        String str3 = new String("QWERTY");

//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.equalsIgnoreCase(str3));


//        switch (str1) {
//            case "QWE": {
//                System.out.println("1");
//                break;
//            }
//            case "QWERTy": {
//                System.out.println("2");
//                break;
//            }
//            case "QWERTY": {
//                System.out.println("3");
//            }
//        }

//        int x = 1;
//
//
//        switch (x) {
//            case 1: {
//                System.out.println("Start electric system");
//            }
//            case 2: {
//                System.out.println("Start fuel system");
//                break;
//            }
//            case 3: {
//                System.out.println("Start engine");
//            }
//        }
//
//        System.out.println();
//
//        if (x == 1) {
//            System.out.println("Start electric system");
//            System.out.println("Start fuel system");
//        } else if (x == 3) {
//            System.out.println("Start engine");
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter team 1 name");
        String team1Name = scanner.nextLine();

        System.out.println(team1Name);

        System.out.println("Please enter count frags player 1 team 1");
        int player1Team1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(player1Team1);

        if (player1Team1 > 10) {
            System.out.println("WIN!!!!");
        }


        System.out.println("Please enter team 2 name");
        String team2Name = scanner.nextLine();

        System.out.println(team2Name);


    }














    static void demo1() {

//        int a = 3;
//        int b = 5;
//        int c = 7;

//        boolean result = a > b;

//        System.out.println(result);

//        System.out.println("a > b: " + (a > b));
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a >= b: " + (a >= b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a != b: " + (a != b));
//
//
//        System.out.println((a > b) || (b > c));
//
//        System.out.println((a < b) && (b == c));



        int a = 3;
        int b = 6;
        int c = 7;

//        boolean result = (a > b) && (b++ != c) && (a < b) && (b++ == c);
//
//        System.out.println(result);
//        System.out.println(!result);

//        System.out.println((a > b) && (b++ != c) && (a < b) && (b++ == c));
//
//        System.out.println(b);


        System.out.println((a <= ++b) && (b != c) || (b >= c));
    }
}
