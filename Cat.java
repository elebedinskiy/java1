package ru.elebedinskiy.java1;

public class Cat extends Animal {
    protected final float runDistanceMax = 200;
    protected final float jumpHeightMax = 2;

    Cat(String name){
        super(name);
    }

    // кот не умеет плавать
    @Override
    void swim(float swimDistance){
        return;
    }


}