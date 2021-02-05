package ru.elebedinskiy.java1;

public class Plate {
    private int amountFoodPlate; // текущее кол-во еды
    private int amountFoodPlateMax; // максимальное кол-во еды

    // при создании тарелки указываем её максимальную ёмкость и она сразу полна еды
    Plate(int amountFoodPlateMax){
        this.amountFoodPlateMax = amountFoodPlateMax;
        this.amountFoodPlate = amountFoodPlateMax;
    }

    // метод выведет информацию о кол-ве еды в тарелке
    public void info(){
        System.out.println("Количество еды в тарелке: " + amountFoodPlate);
    }

    // метод вернёт текущее кол-во еды в тарелке
    public int getAmountFoodPlate() {
        return amountFoodPlate;
    }

    // метод уменьшит кол-во еды в тарелке после еды с аппетитом животного
    public void amountFoodDecreased(int animalAppetite){
        if (animalAppetite <= getAmountFoodPlate()){
            this.amountFoodPlate = this.amountFoodPlate - animalAppetite;
        }
    }

    // метод пополнит тарелку едой
    public void setFullFood(){
        this.amountFoodPlate = amountFoodPlateMax;
    }

}
