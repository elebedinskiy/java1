package ru.elebedinskiy.java1;

import java.util.Random;

public class Hello {
    public static void main(String[] args) {

        // создали массив котов
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++){
            cats[i] = createCat("Котик-" + (i + 1));
            cats[i].info();
        }

        // для удобства чтения вывода в консоли
        System.out.println();

        // создали полную тарелку с максимальным кол-вом еды 100
        Plate plate1 = new Plate(100);
        plate1.info();
        System.out.println();

        // все коты по очереди кушают из тарелки
        for (int i = 0; i < cats.length; i++){
            cats[i].eatFromPlate(plate1);
            cats[i].info();
            plate1.info();
            System.out.println(); // для удобства чтения вывода в консоли
        }

        System.out.println("Пополнили тарелку");
        plate1.setFullFood(); // пополнили тарелку
        plate1.info();
        System.out.println(); // для удобства чтения вывода в консоли

        // все коты ПОВТОРНО пробуют кушают из тарелки
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromPlate(plate1);
            cats[i].info();
            plate1.info();
            System.out.println(); // для удобства чтения вывода в консоли
        }
    }

    // метод создаст кота с аппетитом от 20 до 50 и сытостью false
    public static Cat createCat(String name){
        Random random = new Random();
        boolean satiety = false;
        int appetite;
        do {
            appetite = random.nextInt(51);
            if (appetite >= 20){
                break;
            }
        } while (true);
        Cat cat = new Cat(name, appetite, satiety);
        return cat;
    }
}