package ru.elebedinskiy.java1;

public class Hello {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Палкан");
        Dog dog3 = new Dog("Бульдог", 600, 20, 1);
        Dog dog4 = new Dog("Мухтар", 800, 50, 2);

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

        System.out.println();

        dog3.run(650); // False: ограничение 600 метров
        dog3.jump(0.5f); // True: ограничение 1 метр
        dog3.swim(18); // True: ограничение 20 метров

        System.out.println();

        dog4.run(750); // True: ограничение 800 метров
        dog4.jump(3); // False: ограничение 2 метра
        dog4.swim(40); // True: ограничение 50 метров


    }
}