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
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println("Обработанный массив: " + Arrays.toString(arr3));

        // Задание 4
        int square = 10; // длинна квадратной сетки массива
        int[][] arr4 = new int[square][square];
        System.out.println("\nЗадание 4: диагональ квадратного двумерного массива заполнить значениями 1");
        diagonalArray(arr4);
        printArray(arr4);

        // Задание 5
        int[] arr5 = new int[arr3.length];
        arr5 = arr3; // За исходный одномерный массив примем полученный из задания 3
        System.out.println("\nЗадание 5: требуется узнать максимальное и минимальное значение");
        System.out.println("Исходный массив: " + Arrays.toString(arr5));
        System.out.println("Максимальное значение: " + maxArrayValue(arr5));
        System.out.println("Минимальное значение: " + minArrayValue(arr5));

    }

    // Метод для вывода массива в консоль
    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Метод для заполнения квардратного массива по диагонали значениями 1
    static void diagonalArray(int arr[][]) {
        for (int i = 0, j = 0, a = (arr.length - 1); i < arr.length; i++, j++, a--) {
            arr[i][j] = 1;
            arr[a][j] = 1; // Задействовал третью переменную "a" для перебора с конца строки
        }
    }

    // Метод возвращающий минимальное значение одномерного массива
    static int minArrayValue(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    // Метод возвращающий минимальное значение одномерного массива
    static int maxArrayValue(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}