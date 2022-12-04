package com.hillel.lonzhansky.lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bведіть ім'я першої команди");
        String teamName1 = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Bведіть кількість фрагів");
        int team1Player1 = scanner2.nextInt();
        int team1Player2 = scanner2.nextInt();
        int team1Player3 = scanner2.nextInt();
        int team1Player4 = scanner2.nextInt();
        int team1Player5 = scanner2.nextInt();
        System.out.println("Bведіть ім'я другої команди");
        String teamName2 = scanner1.nextLine();
        System.out.println("Bведіть кількість фрагів");
        int team2Player1 = scanner2.nextInt();
        int team2Player2 = scanner2.nextInt();
        int team2Player3 = scanner2.nextInt();
        int team2Player4 = scanner2.nextInt();
        int team2Player5 = scanner2.nextInt();

        double result1 = (double)(team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5)/5;
        double result2 = (double)(team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5)/5;

        if (result1 > result2) {
            System.out.println("Перемогла команда " + teamName1 + " набрала " + result1 + " очків");
        } else {
            System.out.println("Перемогла команда " + teamName2 + " набрала " + result2 + " очків");
        }
    }
}