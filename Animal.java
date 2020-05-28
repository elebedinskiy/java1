package ru.elebedinskiy.java1;

public abstract class Animal {
    protected final String name;
    protected float runDistance;
    protected float swimDistance;
    protected float jumpHeight;

    Animal(String name){
        this.name = name;
    }

    abstract void run(float runDistance);
    abstract void swim(float swimDistance);
    abstract void jump(float jumpHeight);

}