package ru.elebedinskiy.java1;

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

        // Задание 1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1: заменить 0 на 1, 1 на 0 в исходном массиве");
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(arr));

        // Задание 2
        int[] arr2 = new int[8];
        for (int i = 0, j = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j; // для шага задействована вторая переменная j
        }
        System.out.println("\nЗадание 2: заполнить в цикле массив длинной 8 и шагом 3:");
        System.out.println("Результат: " + Arrays.toString(arr2));

        // Задание 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nЗадание 3: числа меньшие 6 в исходном массиве умножить на 2");
        System.out.println("Исходный массив: " + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++){
            if (arr3[i] < 6){
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Обработанный массив: " + Arrays.toString(arr3));
    }

}