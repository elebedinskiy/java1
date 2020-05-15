package ru.elebedinskiy.java1;

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {
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
    }
}