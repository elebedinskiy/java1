package ru.elebedinskiy.java1;

public class Cat extends Animal {
    private final float runDistanceMax = 200;
    private final float jumpHeightMax = 2;
    private int appetite;
    private boolean satiety;

    Cat(String name){
        super(name);
    }

    Cat(String name, int appetite, boolean satiety){
        super(name);
        this.appetite = appetite;
        this.satiety = satiety;
    }

    @Override
    public void run(float runDistance){
        if (runDistance <= runDistanceMax){
            System.out.println(name + " пробежал в длину " + runDistance + " метров");
        }
    }

    // кот не умеет плавать
    @Override
    public void swim(float swimDistance){
        return;
    }

    @Override
    public void jump(float jumpHeight){
        if (jumpHeight <= jumpHeightMax){
            System.out.println(name + " прыгнул в высоту на " + jumpHeight + " метров");
        }
    }

    public void info(){
        System.out.println("Инфо: " + getName() + ", аппетит: " + getAppetite() + ", сытость: " + getSatiety());
    }

    public String getName(){
        return name;
    }

    public int getAppetite(){
        return appetite;
    }

    public boolean getSatiety(){
        return satiety;
    }

    public void setIsSatiety(){
        this.satiety = true;
    }

    public void eatFromPlate(Plate plate){
        if (getAppetite() <= plate.getAmountFoodPlate()){
            plate.amountFoodDecreased(getAppetite());
            setIsSatiety(); // покушал, значить сытость установить true
            System.out.println(name + " покушал");
        } else {
            System.out.println("Для " + name + " еды в тарелке не хватило");
        }
    }

}