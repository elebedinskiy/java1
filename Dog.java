package ru.elebedinskiy.java1;

public class Dog extends Animal {
    protected float runDistanceMax = 500;
    protected float swimDistanceMax = 10;
    protected float jumpHeightMax = 0.5f;

    Dog(String name){
        super(name);
    }

    // перегрузка конструктора для возможности задать произвольные ограничения
    Dog(String name, float runDistanceMax, float swimDistanceMax, float jumpHeightMax){
        super(name);
        this.runDistanceMax = runDistanceMax;
        this.swimDistanceMax = swimDistanceMax;
        this.jumpHeightMax = jumpHeightMax;
    }

    @Override
    void run(float runDistance){
        if (runDistance <= runDistanceMax){
            System.out.println(name + " пробежал в длину " + runDistance + " метров");
        }
    }

    @Override
    void swim(float swimDistance){
        if (swimDistance <= swimDistanceMax){
            System.out.println(name + " проплыл в длину " + swimDistance + " метров");
        }
    }

    @Override
    void jump(float jumpHeight){
        if (jumpHeight <= jumpHeightMax){
            System.out.println(name + " прыгнул в высоту на " + jumpHeight + " метров");
        }
    }

}
