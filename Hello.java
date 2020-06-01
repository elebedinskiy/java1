package ru.elebedinskiy.java1;

public class Hello {
    public static void main(String[] args) {

        // кот Мурзик с аппетитом 10
        Cat cat1 = new Cat("Мурзик", 10);

        // кот Барсик с аппетитом 15
        Cat cat2 = new Cat("Барсик", 15);

        // тарелка 1 с кол-вом еды 20
        Plate plate1 = new Plate(20);

        // оба кота кушают с одной тарелки
        plate1.info();
        cat1.eatFromPlate();
        plate1.info();
        cat2.eatFromPlate();
        plate1.info();

    }
}