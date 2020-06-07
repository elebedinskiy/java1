package ru.elebedinskiy.java1;

import java.util.Random;
import java.util.Scanner;

public class Hello {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice = getNumberFromScannerAndValid("Выберите игру: 1 - угадай число, 2 - угадай слово.", 1, 2);
        System.out.println("Вы выбрали = " + userChoice);
        if (userChoice == 1) {
            gameOne();
        } else gameTwo();
    }

    public static void gameOne() {
        Random rand = new Random();
        int secretRundomNumber = rand.nextInt(10); // Задаём случайное число
        int numberOfAttempts = 3; // Кол-во попыток

        System.out.println("\nЦель игры - угадать случайное число от 0 до 9!\nУ вас " + numberOfAttempts + " попытки");

        for (int i = numberOfAttempts; i >= 0; i--){
            if (i == 0) {
                System.out.println("\nПопыток больше нет. Вы проиграли");
                break;
            }
            int userEnterNumber = getNumberFromScannerAndValid("\nВведите число от 0 до 9", 0, 9);
            System.out.println("Вы ввели = " + userEnterNumber);

            if (userEnterNumber == secretRundomNumber) {
                System.out.println("Вы угадали! Это победа!");
                break;
            } else if (userEnterNumber > secretRundomNumber) {
                System.out.println("Вы ввели слишком большое число.");
            } else {
                System.out.println("Вы ввели слишком маленькое число.");
            }
        }
        int userChoice = getNumberFromScannerAndValid("\n1 - Играем ещё раз. 0 - нет", 0, 1);
        if (userChoice == 1){
            System.out.println("Отлично");
            gameOne();
        } else {
            System.out.println("Пользователь завершил игру.");
        }
    }

    public static void gameTwo() {
        System.out.println("Играем в 'Угадай слово'");
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        Random rand = new Random();

        // присвоили строке значение загаданного элемента массива
        String secretRundomWords = words[rand.nextInt(words.length)];
        System.out.println("Загадали: " + secretRundomWords + " (для самопроверки)"); // по итогам разработки закомментировать

        // присвоили строке введённое пользователем значение
        Scanner sc = new Scanner(System.in);
        String userInputWord = sc.nextLine();
        System.out.println("Введённое слово: " + userInputWord);

        /* тут должна быть обработка
        .
        .
        .
        .
         */

        int userChoice = getNumberFromScannerAndValid("\n1 - Играем ещё раз. 0 - нет", 0, 1);
        if (userChoice == 1){
            System.out.println("Отлично");
            gameTwo();
        } else {
            System.out.println("Пользователь завершил игру.");
        }
    }

    // метод проведёт валидацию целого числа, введённого пользователем в консоли
    public static int getNumberFromScannerAndValid(String message, int min, int max) {
        int userEnterNumber; //
        do {
            System.out.println(message);
            userEnterNumber = sc.nextInt();
            if (userEnterNumber > max || userEnterNumber < min){
                System.out.println("Будьте внимательнее при вводе.");
            }
        } while (userEnterNumber > max || userEnterNumber < min);
        return userEnterNumber;
    }

}