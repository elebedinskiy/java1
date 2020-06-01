package ru.elebedinskiy.java1;

public class Plate {
    private static int amountFoodPlate;

    Plate(int amountFoodPlate){
        this.amountFoodPlate = amountFoodPlate;
    }

    public void info(){
        System.out.println("Количество еды в тарелке: " + amountFoodPlate);
    }

    public static int getAmountFoodPlate() {
        return amountFoodPlate;
    }

    public static void amountFoodDecreased(int animalAppetite){
        if (amountFoodPlate >= animalAppetite){
            amountFoodPlate = amountFoodPlate - animalAppetite;
        }
    }

}
