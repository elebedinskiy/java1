package ru.elebedinskiy.java1;

public class Cat extends Animal {
    protected final float runDistanceMax = 200;
    protected final float jumpHeightMax = 2;

    Cat(String name){
        super(name);
    }

    @Override
    void run(float runDistance){
        if (runDistance <= runDistanceMax){
            System.out.println(name + " пробежал в длину " + runDistance + " метров");
        }
    }

    // кот не умеет плавать
    @Override
    void swim(float swimDistance){
        return;
    }

    @Override
    void jump(float jumpHeight){
        if (jumpHeight <= jumpHeightMax){
            System.out.println(name + " прыгнул в высоту на " + jumpHeight + " метров");
        }
    }

}