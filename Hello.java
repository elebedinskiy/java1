package ru.elebedinskiy.java1;

public class Hello {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mursik");
        Cat cat2 = new Cat("Barsik");
        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Palkan");

        cat1.run(100); // True: ограничение 200 метров
        cat1.jump(1); // True: ограничение 2 метра
        cat1.swim(50); // False: кот не умеет плавать, нет результата

        System.out.println();

        cat2.run(250); // False: ограничение 200 метров
        cat2.jump(2); // True: ограничение 2 метра
        cat2.swim(50); // False: кот не умеет плавать, нет результата

        System.out.println();

        dog1.run(500); // True: ограничение 500 метров
        dog1.jump(0.5f); // True: ограничение 0,5 метра
        dog1.swim(15); // False: ограничение 10 метров

        System.out.println();

        dog2.run(600); // False: ограничение 500 метров
        dog2.jump(1); // False: ограничение 0,5 метра
        dog2.swim(10); // True: ограничение 10 метров

    }
}