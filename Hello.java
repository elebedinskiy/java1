package ru.elebedinskiy.java1;

public class Hello {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Mursik");
        Cat cat2 = new Cat("Barsik");
        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Palkan");

        cat1.run(50);
        cat1.jump(100);
        cat1.swim(150);

        System.out.println();

        cat2.run(50);
        cat2.jump(100);
        cat2.swim(150);

        System.out.println();

        dog1.run(50);
        dog1.jump(100);
        dog1.swim(150);

        System.out.println();

        dog2.run(50);
        dog2.jump(100);
        dog2.swim(150);

    }
}