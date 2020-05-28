package ru.elebedinskiy.java1;

public abstract class Animal {
    protected final String name;
    protected float runDistance = 0;
    protected float swimDistance = 0;
    protected float jumpHeight = 0;

    Animal(String name){
        this.name = name;
    }

    void run(float runDistance){
        System.out.println(name + " пробежал в длину " + runDistance + " метров");
    }

    void swim(float swimDistance){
        System.out.println(name + " проплыл в длину на " + swimDistance + " метров");
    }

    void jump(float jumpHeight){
        System.out.println(name + " прыгнул в высоту на " + jumpHeight + " метров");
    }

    // читаем имя объекта класса
    public String getName() {
        return name;
    }

    public float getRunDistance() {
        return runDistance;
    }

    public float getSwimDistance() {
        return swimDistance;
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setRunDistance(float runDistance) {
        this.runDistance = runDistance;
    }

    public void setSwimDistance(float swimDistance) {
        this.swimDistance = swimDistance;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

}