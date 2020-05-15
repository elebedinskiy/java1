package ru.elebedinskiy.java1;

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

        // Задание 1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1:\nИсходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(arr));

        // Задание 2
        int[] arr2 = new int[8];
        for (int i = 0, j = 0; i < arr2.length; i++, j = j + 3){
            arr2[i] = j; // для шага задействована вторая переменная j
        }
        System.out.println("\nЗадание 2:\nЗаполненный в цикле массив длинной 8 и шагом 3: " + Arrays.toString(arr2));

    }

}