package ru.elebedinskiy.java1;

public class Cat extends Animal {
    private final float runDistanceMax = 200;
    private final float jumpHeightMax = 2;
    private int appetite;

    Cat(String name){
        super(name);
    }

    Cat(String name, int appetite){
        super(name);
        this.appetite = appetite;
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

    public void eatFromPlate(){
        if (appetite <= Plate.getAmountFoodPlate()){
            Plate.amountFoodDecreased(appetite);
            System.out.println("Кот по имени " + name + " покушал(-а)");
        } else {
            System.out.println("Для кота " + name + " еды в тарелке не хватило");
        }
    }

}