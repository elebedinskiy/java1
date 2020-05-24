package ru.elebedinskiy.java1;

import java.util.Random;
import java.util.Scanner;

public class Hello {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice = getNumberFromScanner("Введите: 1 - угадай число, 2 - угадай слово.", 1, 2);
        System.out.println("Вы выбрали = " + userChoice);
        if (userChoice == 1){
            gameOne();
        } else if (userChoice == 2) {
            gameTwo();
        }

    }

    public static void gameOne() {
        // пишем первую игру
        System.out.println("Первая игра");

    }

    public static void gameTwo() {
        // пишем первую игру

        // Задаём случайное число
        Random rand = new Random();
        int secretRundomNumber = rand.nextInt(10);

        System.out.println("Вторая игра");

    }

    public static int getNumberFromScanner(String message, int min, int max) {
        int userNum;
        do {
            System.out.println(message);
            userNum = sc.nextInt();
        } while (userNum > max || userNum < min);
        return userNum;
    }

}