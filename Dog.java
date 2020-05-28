package ru.elebedinskiy.java1;

public class Dog extends Animal {
    protected final float runDistanceMax = 500;
    protected final float swimDistanceMax = 10;
    protected final float jumpHeightMax = 0.5f;

    Dog(String name){
        super(name);
    }

}
